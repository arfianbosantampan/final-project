package com.example.danang.simpleandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void fg1(View view) {Intent intent = new Intent(SecondActivity.this, MainActivity.class);
    }

    public void fg2(View view) {
    }

    public void bt1(View view) {
        Intent intent = new Intent(SecondActivity.this, Biodataactivity.class);
        startActivity(intent);
    }

    public void bt2(View view) {
        Intent intent = new Intent(SecondActivity.this, Tugasactivity.class);
        startActivity(intent);
    }

    public void bt3(View view) {
        Intent intent = new Intent(SecondActivity.this, activity_jadwal.class);
        startActivity(intent);
    }

    public void bt4(View view) {
        Intent intent = new Intent(SecondActivity.this, Main2Activity.class);
        startActivity(intent);
    }
}
