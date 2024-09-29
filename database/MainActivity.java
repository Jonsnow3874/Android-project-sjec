package com.example.database;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText name, mobile, address;
    MyDBHelper db;
    Button insert, view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        insert = findViewById(R.id.buttoninsert);
        view = findViewById(R.id.buttonview);
        name = findViewById(R.id.name);
        mobile = findViewById(R.id.mobileno);
        address = findViewById(R.id.address);
        db = new MyDBHelper(this);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = name.getText().toString();
                String usercon = mobile.getText().toString();
                String useradd = address.getText().toString();
                Boolean checkinsert = db.insertData(username, usercon, useradd);
                if (checkinsert) {
                    Toast.makeText(MainActivity.this, "User data inserted", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "User data not inserted", Toast.LENGTH_SHORT).show();
                }
            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = db.getdata();
                if (res.getCount() == 0) {
                    Toast.makeText(MainActivity.this, "No Entry exist", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuilder buffer = new StringBuilder();
                while (res.moveToNext()) {  // Corrected method name
                    buffer.append("Name: ").append(res.getString(0)).append("\n");
                    buffer.append("Contact: ").append(res.getString(1)).append("\n");
                    buffer.append("Address: ").append(res.getString(2)).append("\n");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setCancelable(true);
                builder.setTitle("User Details");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });
    }
}
