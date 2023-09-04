package com.example.bmi_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ft, in, weight;
    TextView btn, ruselt ,resultnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ft = findViewById(R.id.ft);
        in = findViewById(R.id.in);
        weight = findViewById(R.id.kg);
        btn = findViewById(R.id.btn);
        ruselt = findViewById(R.id.result);
        resultnum = findViewById(R.id.resultnum);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              int myft = Integer.parseInt( ft.getText().toString());
              int myin = Integer.parseInt( in.getText().toString());
              int mykg = Integer.parseInt( weight.getText().toString());


          int totalin =myft*12+myin;
          double totalcm = totalin*2.53;
          double totalM = totalcm/100;
          double bmi =mykg/(totalM*totalM);
          String BMI = String.valueOf(bmi);
          if (bmi>25){

              ruselt.setText("overweight");
              resultnum.setText(BMI);
          }

                if (bmi<18){

                    ruselt.setText("lowweight");
                    resultnum.setText(BMI);
                }
                else {

                    ruselt.setText("healthy");
                    resultnum.setText(BMI);
                }












            }
        });


    }
}