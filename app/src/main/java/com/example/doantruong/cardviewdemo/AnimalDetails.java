package com.example.doantruong.cardviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalDetails extends AppCompatActivity {
    ImageView imageView;
    TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animal_details_layout);
        imageView = (ImageView) findViewById(R.id.details_animal_picture);
        txtName = (TextView) findViewById(R.id.details_animal_name);
        imageView.setImageResource(getIntent().getIntExtra("animal_pictures",00));
        txtName.setText("Name : " + getIntent().getStringExtra("animal_name"));
    }
}
