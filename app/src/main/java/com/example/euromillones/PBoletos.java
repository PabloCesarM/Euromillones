package com.example.euromillones;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PBoletos extends AppCompatActivity {


    private Button btnComprar;
    private TextView tvBoleto, tvNumGanador, tvStarWin, tvPremio;

    //private static TextView fondoPBoleto;

    private static double premio = 0;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p_boletos);

        btnComprar = findViewById(R.id.btnComprar);


        tvBoleto = findViewById(R.id.tvBoleto);
        tvNumGanador = findViewById(R.id.tvNumGanador);
        tvStarWin = findViewById(R.id.tvStarWin);
        tvPremio = findViewById(R.id.tvPremio);

        //fondoPBoleto = findViewById(R.id.fondoPBoleto);

        // Recuperar el array desde el Intent
        Intent intent = getIntent();
        int[] numeros = intent.getIntArrayExtra("arrayNumBoleto");

        if (numeros != null) {
            // Mostrar los números en el TextView tvBoleto
            StringBuilder sb = new StringBuilder();
            for (int numero : numeros) {
                sb.append(numero).append(" ");
            }
            tvBoleto.setText(sb.toString().trim());
        }

    }


    // metodo para generar numero aleatorio entre 1000000 y 50000
    public static double generarPremio() {
        int min = 1000000;
        int max = 500000;
        double premio =  Math.floor(Math.random() * (max - min + 1) + min);
        return premio;
    }


    // metodo para calcular el premio
    public void calcularPremio(View view) {
        double premioTotal = generarPremio();
        int numerosAcertados = 0, estrellasAcertadas = 0;

        Intent intent = getIntent();
        int[] numerosArray = intent.getIntArrayExtra("arrayNumBoleto");
        //int[] estrellasArray = intent.getIntArrayExtra("arrayEstrellasBoleto");

        //boleto ganador
        int[] numerosGanador = generarNumerosPremiados();
        int[] estrellasGanador = generarEstrellasPremiadas();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (numerosArray[i] == numerosGanador[j]) {
                    numerosAcertados++;
                }
            }
        }

       /* for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (estrellasArray[i] == estrellasGanador[j]) {
                    estrellasAcertadas++;
                }
            }
        }*/


        if (numerosAcertados == 5 && estrellasAcertadas == 2) {
            premio = premioTotal * 1.00;
        } else if (numerosAcertados == 5 && estrellasAcertadas == 1) {
            premio = premioTotal * 0.95;
        } else if (numerosAcertados == 5 && estrellasAcertadas == 0) {
            premio = premioTotal * 0.80;
        } else if (numerosAcertados == 4 && estrellasAcertadas == 2) {
            premio = premioTotal * 0.75;
        } else if (numerosAcertados == 4 && estrellasAcertadas == 1) {
            premio = premioTotal * 0.60;
        } else if (numerosAcertados == 4 && estrellasAcertadas == 0) {
            premio = premioTotal * 0.40;
        } else if (numerosAcertados == 3 && estrellasAcertadas == 2) {
            premio = premioTotal * 0.50;
        } else if (numerosAcertados == 3 && estrellasAcertadas == 1) {
            premio = premioTotal * 0.20;
        } else if (numerosAcertados == 3 && estrellasAcertadas == 0) {
            premio = premioTotal * 0.10;
        } else if (numerosAcertados == 2 && estrellasAcertadas == 2) {
            premio = premioTotal * 0.30;
        } else if (numerosAcertados == 2 && estrellasAcertadas == 1) {
            premio = premioTotal * 0.03;
        } else if (numerosAcertados == 1 && estrellasAcertadas == 2) {
            premio = premioTotal * 0.05;
        }


        if (premio != 0) {
            tvPremio.setText("Enhorabuena has ganado " + String.valueOf(premio) + " euros");
        }else {
            tvPremio.setText("Lo sentimos, la proxima vez sera mejor");
        }


    }


    // metodo para generar array de estrellas aleatorias entre 1 y 12
    public int[] generarNumerosPremiados() {
        int[] numerosPremiados = new int[5];
        for (int i = 0; i < 5; i++) {
            numerosPremiados[i] = (int) Math.floor(Math.random() * 50 + 1);
        }
        tvNumGanador.setText(String.valueOf(numerosPremiados[0]) + " " + String.valueOf(numerosPremiados[1]) + " "
                + String.valueOf(numerosPremiados[2]) + " " + String.valueOf(numerosPremiados[3]) + " "
                + String.valueOf(numerosPremiados[4]));
        return numerosPremiados;
    }
    public int[] generarEstrellasPremiadas() {
        int[] estrellasPremiadas = new int[2];
        for (int i = 0; i < 2; i++) {
            estrellasPremiadas[i] = (int) Math.floor(Math.random() * 12 + 1);
        }
        tvStarWin.setText(String.valueOf(estrellasPremiadas[0]) + " " + String.valueOf(estrellasPremiadas[1]));
        return estrellasPremiadas;
    }



}

