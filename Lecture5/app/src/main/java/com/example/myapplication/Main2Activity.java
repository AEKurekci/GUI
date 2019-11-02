package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtName = (TextView)findViewById(R.id.textView);
        TextView txtAge = (TextView)findViewById(R.id.textView2);
        edt = findViewById(R.id.editText);

        final String name = (String)getIntent().getStringExtra("name");
        int age = (int)getIntent().getIntExtra("age",0);

        txtAge.setText(age+"");
        txtName.setText(name);

        Bundle bundle = getIntent().getExtras();
        int ages[] = bundle.getIntArray("ages");
        txtName.setText(bundle.getString("nameMeh"));
        txtAge.setText(ages[1]+"");

        Button btnClose = findViewById(R.id.button2);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                int value = Integer.parseInt(edt.getText().toString());
                setResult(Activity.RESULT_OK, intent.putExtra("value",value));
                finish();
            }
        });
    }
}
