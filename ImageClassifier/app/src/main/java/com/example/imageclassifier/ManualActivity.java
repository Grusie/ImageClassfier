package com.example.imageclassifier;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ManualActivity extends AppCompatActivity {

    private Button exitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);

        Button galleryBtn = findViewById(R.id.galleryBtn);
        galleryBtn.setOnClickListener(view -> {
            Intent i = new Intent(ManualActivity.this, GalleryActivity.class);
            startActivity(i);
        });

        Button cameraBtn = findViewById(R.id.cameraBtn);
        cameraBtn.setOnClickListener(view -> {
            Intent i = new Intent(ManualActivity.this, CameraActivity.class);
            startActivity(i);
        });

        Button btn_exit = findViewById(R.id.btn_exit);
        btn_exit.setOnClickListener(view -> {
            Intent i = new Intent(ManualActivity.this,MainActivity.class);
            startActivity(i);
        });
    }
}