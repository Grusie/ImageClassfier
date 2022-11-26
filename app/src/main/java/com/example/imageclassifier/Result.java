package com.example.imageclassifier;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

public class Result extends AppCompatActivity {

    int i = 1;
    NestedScrollView nsc_view;
    ImageButton btn_Hide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Button btnHome = findViewById(R.id.btnHome);
        btnHome.setOnClickListener(view -> {
            Intent i = new Intent(Result.this, MainActivity.class);
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

        nsc_view = findViewById(R.id.nsc_view);
        btn_Hide = findViewById(R.id.btn_Hide);

        nsc_view.setVisibility(View.VISIBLE);

        btn_Hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 1 - i;
                if(i == 0){
                    nsc_view.setVisibility(View.GONE);
                    btn_Hide.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
                else{
                    nsc_view.setVisibility(View.VISIBLE);
                    btn_Hide.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }
            }
        });
    }

}