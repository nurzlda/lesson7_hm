package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView txtDate;
    private Button btnKill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
       txtDate = findViewById(R.id.text2);
       btnKill = findViewById(R.id.btn_kill);
       txtDate.setText( getIntent().getExtras().getString("testNameData"));
       onClickListener();
    }

    private void onClickListener() {
        btnKill.setOnClickListener(view -> {
       finish();
        });
    }
}