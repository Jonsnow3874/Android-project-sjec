package com.example.ex11graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    Button rect,square,circle,line;
    Bitmap bp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        bp= Bitmap.createBitmap(520,1200,Bitmap.Config.ARGB_8888);
        ImageView imageView=findViewById(R.id.imageView);
        imageView.setImageBitmap(bp);
        Canvas c=new Canvas(bp);

        rect = findViewById(R.id.rect);
        square = findViewById(R.id.square);
        circle = findViewById(R.id.circle);
        line = findViewById(R.id.line);

        rect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paint p =new Paint();
                p.setColor(Color.BLUE);
                p.setTextSize(50);

                c.drawText("Rectangle",50,150,p);
                c.drawRect(50,200,200,500,p);
            }
        });
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paint p1 =new Paint();
                p1.setColor(Color.RED);
                p1.setTextSize(50);

                c.drawText("Square",350,150,p1);
                c.drawRect(280,200,480,400,p1);
            }
        });
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paint p2 =new Paint();
                p2.setColor(Color.BLACK);
                p2.setTextSize(50);

                c.drawText("Circle",100,600,p2);
                c.drawCircle(200,700,80,p2);
            }
        });
        line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paint p3=new Paint();
                p3.setColor(Color.BLACK);
                p3.setTextSize(50);

                c.drawText("Circle",100,600,p3);
                c.drawLine(200,700,80,200,p3);
            }
        });
    }
}