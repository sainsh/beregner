package com.example.beregner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mAEditText;
    private EditText mBEditText;
    private TextView mResultsTextView;
    private Calculator calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAEditText = findViewById(R.id.a);
        mBEditText = findViewById(R.id.b);
        mResultsTextView = findViewById(R.id.results);
        calc = new Calculator();

    }

    public void plusOnClick(View view) {
        if (!TextUtils.isEmpty(mAEditText.getText())||!TextUtils.isEmpty(mBEditText.getText())) {
            mResultsTextView.setText(String.valueOf(calc.plus(mAEditText.getText(), mBEditText.getText())));
        }
    }

    public void minusOnClick(View view) {
        if (!TextUtils.isEmpty(mAEditText.getText())||!TextUtils.isEmpty(mBEditText.getText())) {
            mResultsTextView.setText(String.valueOf(calc.minus(mAEditText.getText(), mBEditText.getText())));
        }
    }

    public void multOnClick(View view) {
        if (!TextUtils.isEmpty(mAEditText.getText())||!TextUtils.isEmpty(mBEditText.getText())) {

            mResultsTextView.setText(String.valueOf(calc.mult(mAEditText.getText(), mBEditText.getText())));
        }
    }

    public void divideOnClick(View view) {
        if (!TextUtils.isEmpty(mAEditText.getText())||!TextUtils.isEmpty(mBEditText.getText())) {
            mResultsTextView.setText(String.valueOf(calc.divide(mAEditText.getText(), mBEditText.getText())));
        }

    }
}
