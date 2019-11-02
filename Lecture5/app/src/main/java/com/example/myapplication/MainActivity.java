package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b;
    Button btnBrowser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button)findViewById(R.id.button);
        /*b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        });*/
        btnBrowser = (Button)findViewById(R.id.btnBrowser);
        btnBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ceng.mu.edu.tr/"));
                startActivity(iBrowser);
            }
        });


    }

    public void buttonClicked(View vies){
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("age", 5);
        i.putExtra("name", "Ali");

        //Bundle example
        Bundle bund = new Bundle();
        int ages[] = {5,8,9};
        bund.putString("nameMeh","Mehmet");
        bund.putIntArray("ages",ages);
        i.putExtras(bund);

        startActivityForResult(i,0);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == Activity.RESULT_OK){
            int value = data.getIntExtra("value",0);
            b.setText(value+"");
        }
    }
}
