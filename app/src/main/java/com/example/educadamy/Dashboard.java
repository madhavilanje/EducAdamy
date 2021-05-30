package com.example.educadamy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//          --oceanic:#3DCFD3;
//        --black:#161616;
//        --white:#FFFFFF;
//        --grey:#898989;
//        --light:#F2F2F2;
//        --background:#070606;
public class Dashboard extends AppCompatActivity {
    Button btncpp;
    Button btnpython;
    Button btnjava;
    Button btnsql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        btncpp = findViewById(R.id.Cpp);
        btnpython = findViewById(R.id.cpp3);
        btnjava = findViewById(R.id.cpp4);
        btnsql = findViewById(R.id.cpp5);

        btncpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Dashboard.this, "Opening C/C++", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Cpp.class);
                startActivity(intent);
            }
        });
        btnpython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Dashboard.this, "Opening Python Programming", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Python.class);
                startActivity(intent);
            }
        });
        btnjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Dashboard.this, "Opening Java Programming", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MySql.class);
                startActivity(intent);
            }
        });
        btnsql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Dashboard.this, "Opening MySql", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Cpp.class);
                startActivity(intent);
            }
        });

    }
}