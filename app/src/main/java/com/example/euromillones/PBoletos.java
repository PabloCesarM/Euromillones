package com.example.euromillones;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PBoletos extends AppCompatActivity {


    private Button btnComprar, btnVerGanador;
    private TextView tvNumGanador, tvStarWin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p_boletos);

        btnComprar = findViewById(R.id.btnComprar);
        btnVerGanador = findViewById(R.id.btnVerGanador);

        tvNumGanador = findViewById(R.id.tvNumGanador);
        tvStarWin = findViewById(R.id.tvStarWin);
    }


    // metodo para generar numero aleatorio entre 1000000 y 50000
    public int generarPremio() {
        int min = 1000000;
        int max = 500000;
        int premio = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return premio;
    }


    // metodo para generar array de estrellas aleatorias entre 1 y 12
    public void generarBoletoPremiado() {
        int[] numerosPremiados = new int[5];
        for (int i = 0; i < 5; i++) {
            numerosPremiados[i] = (int) Math.floor(Math.random() * 50 + 1);
        }
        tvNumGanador.setText(String.valueOf(numerosPremiados[0]) + " " + String.valueOf(numerosPremiados[1]) + " "
                + String.valueOf(numerosPremiados[2]) + " " + String.valueOf(numerosPremiados[3]) + " "
                + String.valueOf(numerosPremiados[4]));

        int[] estrellasPremiadas = new int[2];
        for (int i = 0; i < 2; i++) {
            estrellasPremiadas[i] = (int) Math.floor(Math.random() * 12 + 1);
        }
        tvStarWin.setText(String.valueOf(estrellasPremiadas[0]) + " " + String.valueOf(estrellasPremiadas[1]));
    }



}

