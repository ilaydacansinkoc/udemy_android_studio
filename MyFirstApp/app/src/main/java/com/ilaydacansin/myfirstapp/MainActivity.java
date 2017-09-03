package com.ilaydacansin.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button button = (Button) findViewById(R.id.myButton);

        editText  = (EditText) findViewById(R.id.editText);
        editText2  = (EditText) findViewById(R.id.editText2);
        result = (TextView) findViewById(R.id.resultText);

    }

    public void sum(View view){

        float a = Float.parseFloat(editText.getText().toString());
        float b = Float.parseFloat(editText2.getText().toString());
        float result_ = a+b;

        result.setText("Result:  "+result_);


    }
    public void substract(View view){

        float a = Float.parseFloat(editText.getText().toString());
        float b = Float.parseFloat(editText2.getText().toString());
        float result_ = a-b;

        result.setText("Result:  "+result_);

    }
    public void multiply(View view){

        float a = Float.parseFloat(editText.getText().toString());
        float b = Float.parseFloat(editText2.getText().toString());
        float result_ = a*b;

        result.setText("Result:  "+result_);

    }
    public void divide(View view){

        float a = Float.parseFloat(editText.getText().toString());
        float b = Float.parseFloat(editText2.getText().toString());
        float result_ = a/b;

        result.setText("Result:  "+result_);

    }


}
