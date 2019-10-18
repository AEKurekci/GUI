package com.example.listviewactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnArray;
    Button btnCustom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnArray = (Button)findViewById(R.id.btnArray);
        btnCustom = (Button)findViewById(R.id.btnCustom);
/*
        btnArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ArrayAdapterActivity.class);
                startActivity(i);
            }
        });*/

        AdapterButtonListener listener = new AdapterButtonListener();
        btnArray.setOnClickListener(listener);

        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, CustomAdaptorActivity.class);
                startActivity(in);
            }
        });
    }

    private class AdapterButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Log.d("AdapterButton"," Clicked!");
            Intent i = new Intent(MainActivity.this, ArrayAdapterActivity.class);
            startActivity(i);
        }
    }
}
