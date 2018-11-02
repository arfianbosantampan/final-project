package com.example.danang.simpleandroid;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();
        TextView nama = (TextView) findViewById(R.id.user);
        nama.setText(bundle.getCharSequence("nama"));
    }



    public void keyfragment(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class );
        startActivity(intent);
    }

    public void keyactivity(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class );
        startActivity(intent);
    }
}
