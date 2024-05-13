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

public class MainActivity extends AppCompatActivity {
    Button btnP1, btnP2, btnP3, btnP4, btntutup ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnP1 = (Button) findViewById(R.id.btnP1);
        btnP2 = (Button) findViewById(R.id.btnP2);
        btnP3 = (Button) findViewById(R.id.btnP3);
        btnP4 = (Button) findViewById(R.id.btnP4);
        Button btnTutup = (Button) findViewById(R.id.btntutup);
        btnTutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        btnP4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent bukaempat = new Intent(getApplicationContext(), EmpatActivity.class);
               startActivity(bukaempat);
            }
        });

        btnP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukatiga = new Intent(getApplicationContext(), TigaActivity.class);
                startActivity(bukatiga);
            }
        });

        btnP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukadua = new Intent(getApplicationContext(), DuaActivity.class);
                startActivity(bukadua);
            }
        });

        btnP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukasatu = new Intent(getApplicationContext(), SatuActivity.class);
                startActivity(bukasatu);
            }
        });




    }
}