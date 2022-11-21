package com.example.imageclassifier;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Button btnHome = findViewById(R.id.btnHome);
        btnHome.setOnClickListener(view -> {
            Intent i = new Intent(Result.this, MainActivity.class);
            startActivity(i);
        });

        Button btnReCapture = findViewById(R.id.btnReCapture);
        btnReCapture.setOnClickListener(view -> {
            Intent i = new Intent(Result.this, CameraActivity.class);
            startActivity(i);
        });

        Button btnToCodeGenerator = findViewById(R.id.btnToCodeGenerator);
        btnToCodeGenerator.setOnClickListener(view -> {
            Intent i = new Intent(Result.this, CodeGenerator.class);
            startActivity(i);
        });

        Button exitBtn = findViewById(R.id.exitBtn);
        exitBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setMessage("정말로 종료하시겠습니까?");
                builder.setTitle("종료 알림창")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("종료 알림창");
                alert.show();
            }
        });
    }
}