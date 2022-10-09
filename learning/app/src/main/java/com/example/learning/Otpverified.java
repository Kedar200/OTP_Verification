package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Otpverified extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpverified);
        Intent intent = getIntent();

        ImageButton menu=findViewById(R.id.imageButton);
        ImageView profile=findViewById(R.id.imageView);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Hello","CLicked");
                Toast.makeText(Otpverified.this,"hello clicked",Toast.LENGTH_SHORT).show();
                profile.setVisibility(View.INVISIBLE);
            }
        });
    }
}