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

public class DuaActivity extends AppCompatActivity {

    Button btnP8, btnP9, btnP10, btnKembali1 ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);

        btnP8 = (Button) findViewById(R.id.btnP8);
        btnP9 = (Button) findViewById(R.id.btnP9);
        btnP10 = (Button) findViewById(R.id.btnP10);
        btnKembali1 = (Button) findViewById(R.id.btnKembali1);
        btnKembali1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kembali= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(kembali);
            }
        });

        btnP10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukaempat = new Intent(getApplicationContext(), EmpatActivity.class);
                startActivity(bukaempat);
            }
        });

        btnP9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukatiga = new Intent(getApplicationContext(), TigaActivity.class);
                startActivity(bukatiga);
            }
        });

        btnP8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukasatu = new Intent(getApplicationContext(), SatuActivity.class);
                startActivity(bukasatu);
            }
        });

    }
}