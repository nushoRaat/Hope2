package com.example.hope;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

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



        ImageSlider imageSlider = findViewById(R.id.imgslider);


        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.background,"Happiness,It is not how much we have,but how much we enjoy,that makes happiness"));
        slideModels.add(new SlideModel(R.drawable.groupo,"Optimism,The basis of optimism is sheer terror!"));
        slideModels.add(new SlideModel(R.drawable.groupt,"Patience,To get what you love you must first be patient with what you hate"));
        slideModels.add(new SlideModel(R.drawable.groupf));

        imageSlider.setImageList(slideModels,false);



    }

    @Override
    public void onClick(View v) {
        Intent skipintent = new Intent(MainActivity.this,secondpage.class);
        startActivity(skipintent);
    }
}
