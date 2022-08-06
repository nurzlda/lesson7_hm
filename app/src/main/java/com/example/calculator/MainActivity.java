package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Double first, second;
    private Boolean isOperationClick;
    private Integer operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    @SuppressLint("NonConstantResourceId")
    public void onNumberClick(View view) {
        String number = textView.getText().toString();
        switch (view.getId()){
            case R.id.btn_zero:
                if (number.equals("0")){
                    textView.setText("0");
                }else if (isOperationClick){
                    textView.setText("0");
                }else {
                    textView.append("0");
                }
                break;
            case R.id.btn_one:
                if (number.equals("0")){
                    textView.setText("1");
                }else if (isOperationClick){
                    textView.setText("1");
                }else {
                    textView.append("1");
                }
                break;
            case R.id.btn_two:
                if (number.equals("0")){
                    textView.setText("2");
                }else if (isOperationClick){
                    textView.setText("2");
                }else {
                    textView.append("2");
                }
                break;
            case R.id.btn_three:
                if (number.equals("0")){
                    textView.setText("3");
                }else if (isOperationClick){
                    textView.setText("3");
                }else {
                    textView.append("3");
                }
                break;
            case R.id.btn_four:
                if (number.equals("0")){
                    textView.setText("4");
                }else if (isOperationClick){
                    textView.setText("4");
                }else {
                    textView.append("4");
                }
                break;
            case R.id.btn_five:
                if (number.equals("0")){
                    textView.setText("5");
                }else if (isOperationClick){
                    textView.setText("5");
                }else {
                    textView.append("5");
                }
                break;
            case R.id.btn_six:
                if (number.equals("0")){
                    textView.setText("6");
                }else if (isOperationClick){
                    textView.setText("6");
                }else {
                    textView.append("6");
                }
                break;
            case R.id.btn_seven:
                if (number.equals("0")){
                    textView.setText("7");
                }else if (isOperationClick){
                    textView.setText("7");
                }else {
                    textView.append("7");
                }
                break;
            case R.id.btn_eight:
                if (number.equals("0")){
                    textView.setText("8");
                }else if (isOperationClick){
                    textView.setText("8");
                }else {
                    textView.append("8");
                }
                break;
            case R.id.btn_nine:
                if (number.equals("0")){
                    textView.setText("9");
                }else if (isOperationClick){
                    textView.setText("9");
                }else {
                    textView.append("9");
                }
                break;

            case R.id.btn_full_stop:
               if (doltIsPresent(number)){
               }else {
                textView.append(".");}
                break;

            case R.id.btn_clear:
                textView.setText("0");
                first = 0.0;
                second = 0.0;
                break;
        }
        isOperationClick = false;
    }

    @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
                operation= R.id.btn_plus;
                first = Double.parseDouble(textView.getText().toString());
                break;
            case R.id.btn_minus:
                operation= R.id.btn_minus;
                first = Double.parseDouble(textView.getText().toString());
                break;
            case R.id.btn_times:
                operation= R.id.btn_times;
                first = Double.parseDouble(textView.getText().toString());
                break;
            case R.id.btn_divided:
                operation= R.id.btn_divided;
                first = Double.parseDouble(textView.getText().toString());
                break;
            case R.id.btn_equal:
                second = Double.parseDouble(textView.getText().toString());
                if (operation== R.id.btn_plus){
                    double result = first + second;
                    textView.setText(Double.toString(result));
                    break;
                } else if (operation== R.id.btn_minus){
                    double result = first - second;
                    textView.setText(Double.toString(result));
                    break;
                }else if (operation== R.id.btn_times){
                    double result = first * second;
                    textView.setText(Double.toString(result));
                    break;
                } else if (operation== R.id.btn_divided) {
                    double result = first / second;
                    textView.setText(Double.toString(result));
                    break;
                }
        }
        isOperationClick = true;
    }

    public boolean doltIsPresent(String number){
        return number.contains(".");
    }

}