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

public class EmpatActivity extends AppCompatActivity {
    Button btnP14, btnP15, btnP16, btnKembali3 ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empat);

        btnP14 = (Button) findViewById(R.id.btnP14);
        btnP15 = (Button) findViewById(R.id.btnP15);
        btnP16 = (Button) findViewById(R.id.btnP16);
        btnKembali3 = (Button) findViewById(R.id.btnKembali3);

        btnKembali3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kembali3 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(kembali3);
            }
        });

        btnP14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukasatu = new Intent(getApplicationContext(), SatuActivity.class);
                startActivity(bukasatu);
            }
        });

        btnP15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukadua = new Intent(getApplicationContext(), DuaActivity.class);
                startActivity(bukadua);
            }
        });

        btnP16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukatiga = new Intent(getApplicationContext(), TigaActivity.class);
                startActivity(bukatiga);
            }
        });

    }
}