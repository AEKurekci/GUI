package com.example.primecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSearch;
    EditText txtNum;
    TextView txtPrime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum = findViewById(R.id.txtNum);
        txtPrime = findViewById(R.id.txtPrime);

        btnSearch = findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String maxNum = txtNum.getText().toString();
                findPrimeLessThan(Integer.parseInt(maxNum));
            }
        });
    }

    private void findPrimeLessThan(int num) {
        for(int i = num; i > 0; i--){
            if(isPrime(i)){
                txtPrime.setText(i+"");
                return;
            }
        }
    }

    private boolean isPrime(int num) {
        for(int i = num - 1; i > 1; i--){
            if(num % i == 0){
                return  false;
            }
        }
        return true;
    }
}
