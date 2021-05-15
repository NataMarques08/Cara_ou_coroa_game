package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button botao_jogar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        botao_jogar = findViewById(R.id.play_button);
        botao_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ResultadoActivity.class);
                int numero = new Random().nextInt(2);
                intent.putExtra("numero",numero);
                startActivity(intent);
            }
        });
    }
}