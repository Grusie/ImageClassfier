package com.example.imageclassifier;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class CodeGenerator extends AppCompatActivity {
    TextView intentValue;
    Button btnVariable1, btnVariable2, btnReCapture;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_generator);

        toolbar = findViewById(R.id.code_generator_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnVariable1 = findViewById(R.id.btnVariable1);
        btnVariable2 = findViewById(R.id.btnVariable2);
        btnReCapture = findViewById(R.id.btnReCapture);
        Button btnToResult = findViewById(R.id.btnToResult);

        ActivityResultLauncher<Intent> startActivityResult = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == Activity.RESULT_OK) {
                            if (result.getData().getStringExtra("var") != null)
                                btnVariable1.setText(result.getData().getStringExtra("var"));
                            else
                                btnVariable2.setText(result.getData().getStringExtra("var2"));
                        }
                    }
                });

        btnVariable1.setOnClickListener(view -> {
            Intent i = new Intent(this,Save_variable.class);
            i.putExtra("var", "");
            startActivityResult.launch(i);
        });

        btnVariable2.setOnClickListener(view -> {
            Intent i = new Intent(this,Save_variable.class);
            i.putExtra("var2", "");
            startActivityResult.launch(i);
        });

        btnReCapture.setOnClickListener(view -> {
            Intent i = new Intent(this, CameraActivity.class);
            startActivity(i);
        });

        btnToResult.setOnClickListener(view -> {
            Intent i = new Intent(this, Result.class);
            startActivity(i);
        });


        Intent intent = getIntent();
        String text = getIntent().getStringExtra("text");
            intentValue = (TextView) findViewById(R.id.operator1);
            intentValue.setText(text);

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{
                finish();
            }
        }
        return super.onOptionsItemSelected(item);
    }
}