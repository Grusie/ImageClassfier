package com.example.imageclassifier;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class CodeGenerator extends AppCompatActivity {
    TextView intentValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_generator);

        ImageButton home1 = findViewById(R.id.home1);
        home1.setOnClickListener(view -> {
            Intent i = new Intent(CodeGenerator.this,MainActivity.class);
            startActivity(i);
        });

        Button btnVariable1 = findViewById(R.id.btnVariable1);
        btnVariable1.setOnClickListener(view -> {
            Intent i = new Intent(CodeGenerator.this,Save_variable.class);
            startActivity(i);
        });

        Button btnVariable2 = findViewById(R.id.btnVariable2);
        btnVariable2.setOnClickListener(view -> {
            Intent i = new Intent(CodeGenerator.this,Save_variable.class);
            startActivity(i);
        });

        Button btnReCapture = findViewById(R.id.btnReCapture);
        btnReCapture.setOnClickListener(view -> {
            Intent i = new Intent(CodeGenerator.this, CameraActivity.class);
            startActivity(i);
        });

        Button btnToResult = findViewById(R.id.btnToResult);
        btnToResult.setOnClickListener(view -> {
            Intent i = new Intent(CodeGenerator.this, Result.class);
            startActivity(i);
        });


        Intent intent = getIntent();
        String text = getIntent().getStringExtra("text");
            intentValue = (TextView) findViewById(R.id.operator1);
            intentValue.setText(text);


    }
}