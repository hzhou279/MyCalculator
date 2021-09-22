package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addition(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int num1 = Integer.parseInt(myTextField.getText().toString());
        int num2 = Integer.parseInt(myTextField2.getText().toString());
        goToActivity2(Integer.toString(num1 + num2));
    }

    public void subtraction(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int num1 = Integer.parseInt(myTextField.getText().toString());
        int num2 = Integer.parseInt(myTextField2.getText().toString());
        goToActivity2(Integer.toString(num1 - num2));
    }

    public void multiplication(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int num1 = Integer.parseInt(myTextField.getText().toString());
        int num2 = Integer.parseInt(myTextField2.getText().toString());
        goToActivity2(Integer.toString(num1 * num2));
    }

    public void division(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int num1 = Integer.parseInt(myTextField.getText().toString());
        int num2 = Integer.parseInt(myTextField2.getText().toString());
        goToActivity2(Integer.toString(num1 / num2));
    }


    public void goToActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}