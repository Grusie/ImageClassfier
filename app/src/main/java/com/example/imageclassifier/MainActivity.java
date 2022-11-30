package com.example.imageclassifier;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cameraBtn = findViewById(R.id.cameraBtn);
        cameraBtn.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, CameraActivity.class);
            startActivity(i);
        });

        Button btnCodeResult = findViewById(R.id.btnCodeResult);
        btnCodeResult.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, Code_resultActivity.class);
            startActivity(i);
        });

        Button introduce = findViewById(R.id.introduce);
        introduce.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this,ManualActivity.class);
            startActivity(i);
        });


    }
}

