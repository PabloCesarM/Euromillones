package com.example.euromillones;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PBoletos extends AppCompatActivity {


    private Button btnComprar, btnVerGanador;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p_boletos);

        btnComprar = findViewById(R.id.btnComprar);
        btnVerGanador = findViewById(R.id.btnVerGanador);
    }


}

