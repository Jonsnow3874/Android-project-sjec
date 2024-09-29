package com.example.userprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    Button next;
    EditText name,mobileno,add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        next = findViewById(R.id.view);
        name = findViewById(R.id.name);
        add = findViewById(R.id.add);
        mobileno = findViewById(R.id.mobileno);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernames = name.getText().toString();
                String userphone = mobileno.getText().toString();
                String useradd = add.getText().toString();



                Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                i.putExtra("usernames", usernames);
                i.putExtra("userphone", userphone);
                i.putExtra("useradd", useradd);
                startActivity(i);
            }
        });
    }
}