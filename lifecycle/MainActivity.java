package com.example.ex3;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    Button btnxt;
    EditText Text;
    String tag="Event";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.d(tag,"in the OnCreate() event");
        btnxt = findViewById(R.id.btnxt);
        Text=findViewById(R.id.text1);
        btnxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nwtxt=Text.getText().toString();
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("key1",nwtxt);
                startActivity(i);
            }
        });
    }
    public void onStart() {
        super.onStart();
        Log.d(tag,"in the OnStart() event");
    }
    public void onRestart() {
        super.onRestart();
        Log.d(tag,"in the OnRestart() event");
    }
    public void onResume() {
        super.onResume();
        Log.d(tag,"in the onResume() event");
    }
    public void onPause() {
        super.onPause();
        Log.d(tag,"in the onPause() event");
    }
    public void onStop() {
        super.onStop();
        Log.d(tag,"in the onStop() event");
    }
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag,"in the onDestroy() event");
    }
}