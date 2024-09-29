package com.example.prog_5;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,btnstart,btnstop;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.btnsms);
        b2=findViewById(R.id.btncall);
        b3=findViewById(R.id.btnemail);
        b4=findViewById(R.id.btnmap);
        b5=findViewById(R.id.btnbrower);
        btnstart=findViewById(R.id.startButton);
        btnstop=findViewById(R.id.stopButton);


        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,BackgroundService.class);
                startService(i);
            }
        });
        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,BackgroundService.class);
                stopService(i);
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri msguri=Uri.parse("smsto:"+"9945762542");
                Intent smsIntent=new Intent(Intent.ACTION_SENDTO,msguri);
                startActivity(smsIntent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri calluri=Uri.parse("tel:"+"9945762542");
                Intent callIntent=new Intent(Intent.ACTION_DIAL,calluri);
                startActivity(callIntent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri mailuri=Uri.parse("mailto:"+"sharathn9380@gmail.com");
                Intent mailIntent=new Intent(Intent.ACTION_SENDTO,mailuri);
                startActivity(mailIntent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri mapuri=Uri.parse("geo:0,0?q= St.Joseph Engineering College");
                Intent mapIntent=new Intent(Intent.ACTION_VIEW,mapuri);
                startActivity(mapIntent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri browseruri=Uri.parse("https://www.google.com");
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,browseruri);
                startActivity(browserIntent);
            }
        });

    }
}