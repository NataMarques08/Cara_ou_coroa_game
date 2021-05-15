package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    ImageView result;
    Button back_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        result = findViewById(R.id.image_result);
        back_button = findViewById(R.id.back_button);
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero == 0){ // cara
           result.setImageResource(R.drawable.moeda_cara);
        }else{ // coroa
            result.setImageResource(R.drawable.moeda_coroa);
        }

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}