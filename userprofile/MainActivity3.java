package com.example.userprofile;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
    TextView name,mobileno,add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        name = findViewById(R.id.name);
        add = findViewById(R.id.add);
        mobileno = findViewById(R.id.mobileno);


        String usernames = getIntent().getStringExtra("usernames");
        name.setText("Name:"+usernames);
        String userphone = getIntent().getStringExtra("userphone");
        mobileno.setText("Mobile no:"+userphone);
        String useradd = getIntent().getStringExtra("useradd");
        add.setText("Address: "+useradd);
    }
}