package com.example.imageclassifier;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class Save_variable extends AppCompatActivity {

    private BreakIterator nickname;
    private TextView intent_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_variable);



        Button made_v = findViewById(R.id.made_v);
        made_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button result_v = findViewById(R.id.result_v);
        result_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button add_list = findViewById(R.id.add_list);
        add_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final EditText editText = new EditText(Save_variable.this);

                android.app.AlertDialog.Builder dlg = new AlertDialog.Builder(Save_variable.this);
                dlg.setTitle("변수의 이름을 입력하주세요");
                dlg.setView(editText);
                dlg.setPositiveButton("입력완료", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), editText.getText().toString(), Toast.LENGTH_LONG).show();
                    }
                });
                dlg.show();
            }
        });

        Button come_back = findViewById(R.id.come_back);
        come_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Save_variable.this,CodeGenerator.class);
                startActivity(i);
            }
        });
    }
}