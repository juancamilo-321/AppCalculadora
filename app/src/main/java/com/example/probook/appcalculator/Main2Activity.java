package com.example.probook.appcalculator;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    RadioGroup radioGroup;
    TextView resultado;
    EditText numero1;
    EditText numero2;

    float result,valor1,valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resultado = (TextView) findViewById(R.id.textView4);
        numero1 = (EditText) findViewById(R.id.editText2);
        numero2 = (EditText) findViewById(R.id.editText);
        radioGroup = (RadioGroup) findViewById(R.id.grupo);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (checkedId == R.id.radioButton4) {
                    valor1 = Integer.parseInt(numero1.getText().toString());
                    valor2 = Integer.parseInt(numero2.getText().toString());
                    result = valor1 + valor2;

                    resultado.setText(String.valueOf(result));
                } else if (checkedId == R.id.radioButton3) {
                    valor1 = Integer.parseInt(numero1.getText().toString());
                    valor2 = Integer.parseInt(numero2.getText().toString());
                    result = valor1 - valor2;

                    resultado.setText(String.valueOf(result));
                } else if (checkedId == R.id.radioButton2) {
                    valor1 = Integer.parseInt(numero1.getText().toString());
                    valor2 = Integer.parseInt(numero2.getText().toString());
                    result = valor1 * valor2;

                    resultado.setText(String.valueOf(result));
                } else if (checkedId == R.id.radioButton) {
                    valor1 = Integer.parseInt(numero1.getText().toString());
                    valor2 = Integer.parseInt(numero2.getText().toString());
                    result = valor1 / valor2;

                    resultado.setText(String.valueOf(result));
                }
            }
        });

    }
}
