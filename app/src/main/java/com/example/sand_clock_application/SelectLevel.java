package com.example.sand_clock_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SelectLevel extends AppCompatActivity {

    Button btnBack, btnLevel1, btnLevel2, btnLevel3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_level);


        btnBack = findViewById(R.id.btnBack2);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        btnLevel1 = findViewById(R.id.btnPlayLevel1);
        btnLevel2 = findViewById(R.id.btnPlayLevel2);
        btnLevel3 = findViewById(R.id.btnPlayLevel3);


        btnLevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGame(1);
            }
        });

        btnLevel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGame(2);
            }
        });

        btnLevel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGame(3);
            }
        });
    }

    private void startGame(int level) {
        Intent intent = new Intent(SelectLevel.this, GamePlay.class);
        intent.putExtra("SELECTED_LEVEL", level);
        startActivity(intent);
    }
}