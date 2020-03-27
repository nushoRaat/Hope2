package com.example.hope;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button skipToNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skipToNext = (Button) findViewById(R.id.skip);
        skipToNext.setOnClickListener(this);







    }

    @Override
    public void onClick(View v) {
        Intent skipintent = new Intent(MainActivity.this,secondpage.class);
        startActivity(skipintent);
    }
}
