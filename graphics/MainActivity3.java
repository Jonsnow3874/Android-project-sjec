package com.example.ex11graphics;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
Button fade,rotate,zoom,blink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        fade = findViewById(R.id.fade);
        rotate = findViewById(R.id.rotate);
        zoom = findViewById(R.id.zoom);
        blink = findViewById(R.id.blink);

        fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=findViewById(R.id.imageView);
                Animation fadeanim= AnimationUtils.loadAnimation(MainActivity3.this,R.anim.fade);
                imageView.startAnimation(fadeanim);

            }
        });
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=findViewById(R.id.imageView);
                Animation rorateanim= AnimationUtils.loadAnimation(MainActivity3.this,R.anim.rotate);
                imageView.startAnimation(rorateanim);
            }
        });
        zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=findViewById(R.id.imageView);
                Animation zoomanim= AnimationUtils.loadAnimation(MainActivity3.this,R.anim.zoom);
                imageView.startAnimation(zoomanim);
            }
        });
        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=findViewById(R.id.imageView);
                Animation blinkaim= AnimationUtils.loadAnimation(MainActivity3.this,R.anim.blink);
                imageView.startAnimation(blinkaim);
            }
        });
    }
}