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

public class TigaActivity extends AppCompatActivity {

    Button btnP11, btnP12, btnP13, btnKembali2 ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiga);

        btnP11 = (Button) findViewById(R.id.btnP11);
        btnP12 = (Button) findViewById(R.id.btnP12);
        btnP13 = (Button) findViewById(R.id.btnP13);
        btnKembali2 = (Button) findViewById(R.id.btnKembali2);

        btnKembali2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kembali2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(kembali2);
            }
        });

        btnP12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukadua = new Intent(getApplicationContext(), DuaActivity.class);
                startActivity(bukadua);
            }
        });


        btnP13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukaempat = new Intent(getApplicationContext(), EmpatActivity.class);
                startActivity(bukaempat);
            }
        });

        btnP11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukasatu = new Intent(getApplicationContext(), SatuActivity.class);
                startActivity(bukasatu);
            }
        });

    }
}