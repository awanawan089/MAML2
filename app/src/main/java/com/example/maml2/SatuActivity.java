package com.example.maml2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SatuActivity extends AppCompatActivity {

    Button btnP5, btnP6, btnP7, btnKembali ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satu);

        btnP5 = (Button) findViewById(R.id.btnP5);
        btnP6 = (Button) findViewById(R.id.btnP6);
        btnP7 = (Button) findViewById(R.id.btnP7);
        btnKembali = (Button) findViewById(R.id.btnKembali);
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kembali= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(kembali);
            }
        });

        btnP7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukaempat = new Intent(getApplicationContext(), EmpatActivity.class);
                startActivity(bukaempat);
            }
        });

        btnP6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukatiga = new Intent(getApplicationContext(), TigaActivity.class);
                startActivity(bukatiga);
            }
        });

        btnP5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukadua = new Intent(getApplicationContext(), DuaActivity.class);
                startActivity(bukadua);
            }
        });

    }
}