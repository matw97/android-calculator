package com.example.mateusz.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        EditText firstInput = findViewById(R.id.firstNumber);
        EditText secondInput = findViewById(R.id.secondNumber);
        TextView resultView = findViewById(R.id.result);

        try {
            int firstNumber = Integer.parseInt(firstInput.getText().toString());
            int secondNumber = Integer.parseInt(secondInput.getText().toString());
            int result = firstNumber + secondNumber;
            resultView.setText(String.valueOf(result));
        } catch (Exception e) {
            resultView.setText("Inputs can't be empty!");
        }
    }

    public void subtract(View view) {
        EditText firstInput = findViewById(R.id.firstNumber);
        EditText secondInput = findViewById(R.id.secondNumber);
        TextView resultView = findViewById(R.id.result);

        try {
            int firstNumber = Integer.parseInt(firstInput.getText().toString());
            int secondNumber = Integer.parseInt(secondInput.getText().toString());
            int result = firstNumber - secondNumber;
            resultView.setText(String.valueOf(result));
        } catch (Exception e) {
            resultView.setText("Inputs can't be empty!");
        }
    }

    public void multiply(View view) {
        EditText firstInput = findViewById(R.id.firstNumber);
        EditText secondInput = findViewById(R.id.secondNumber);
        TextView resultView = findViewById(R.id.result);

        try {
            int firstNumber = Integer.parseInt(firstInput.getText().toString());
            int secondNumber = Integer.parseInt(secondInput.getText().toString());
            int result = firstNumber + secondNumber;
            resultView.setText(String.valueOf(result));
        } catch (Exception e) {
            resultView.setText("Inputs can't be empty!");
        }
    }

    public void divide(View view) {
        EditText firstInput = findViewById(R.id.firstNumber);
        EditText secondInput = findViewById(R.id.secondNumber);
        TextView resultView = findViewById(R.id.result);
        try {
            int firstNumber = Integer.parseInt(firstInput.getText().toString());
            int secondNumber =  Integer.parseInt(secondInput.getText().toString());
            int result;
            try {
                result = firstNumber / secondNumber;
                resultView.setText(String.valueOf(result));
            } catch (Exception e) {
                resultView.setText("You can't divide by 0!");
            }
        } catch (Exception e) {
            resultView.setText("Inputs can't be empty!");
        }
    }
}
