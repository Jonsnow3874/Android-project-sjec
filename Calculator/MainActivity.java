package com.example.ex2;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView ans;
EditText firstnumber,secnumber;
Button add,sub,multi,div,rcolor;
RadioGroup radioGroup;
RadioButton red,blue,green,yellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ans = findViewById(R.id.ans);
        firstnumber = findViewById(R.id.firstnumber);
        secnumber = findViewById(R.id.secnumber);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        multi = findViewById(R.id.multi);
        div = findViewById(R.id.div);
        red = findViewById(R.id.red);
        blue = findViewById(R.id.blue);
        green = findViewById(R.id.green);
        yellow = findViewById(R.id.yellow);
        rcolor = findViewById(R.id.rcolor);
        radioGroup = findViewById(R.id.radioGroup);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2, res;
                num1 = Integer.parseInt(firstnumber.getText().toString());
                num2 = Integer.parseInt(secnumber.getText().toString());
                res = num1 + num2;
                ans.setText(String.valueOf(res));

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2, res;
                num1 = Integer.parseInt(firstnumber.getText().toString());
                num2 = Integer.parseInt(secnumber.getText().toString());
                res = num1 - num2;
                ans.setText(String.valueOf(res));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2, res;
                num1 = Integer.parseInt(firstnumber.getText().toString());
                num2 = Integer.parseInt(secnumber.getText().toString());
                res = num1 / num2;
                ans.setText(String.valueOf(res));
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2, res;
                num1 = Integer.parseInt(firstnumber.getText().toString());
                num2 = Integer.parseInt(secnumber.getText().toString());
                res = num1 * num2;
                ans.setText("result "+res);
            }
        });
        rcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();

                int color=Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));
                getWindow().getDecorView().setBackgroundColor(color);
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.red:
                        getWindow().getDecorView().setBackgroundColor(Color.RED);
                        break;
                    case R.id.blue:
                        getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.yellow:
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                        break;
                    case R.id.green:
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                        break;
                }
            }
        });
    }
}
