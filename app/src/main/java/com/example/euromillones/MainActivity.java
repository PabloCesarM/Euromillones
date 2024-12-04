package com.example.euromillones;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.graphics.Color;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    // todos los elementos que hay que declarar
    // TEXTVIEW
    private TextView tv1Numero, tv2Reintegro;

    // IMAGEBUTTON
    private ImageButton imb01, imb02, imb03, imb04, imb05, imb06, imb07, imb08, imb09, imb10, imb11, imb12, imb13, imb14, imb15, imb16, imb17, imb18, imb19, imb20;
    private ImageButton imb21, imb22, imb23, imb24, imb25, imb26, imb27, imb28, imb29, imb30, imb31, imb32, imb33, imb34, imb35, imb36, imb37, imb38, imb39, imb40;
    private ImageButton imb41, imb42, imb43, imb44, imb45, imb46, imb47, imb48, imb49, imb50;
    //imagebutton estrellas
    private ImageButton imbStar1, imbStar2;
    //BUTTON
    private Button btnElegirNum, btnBorrar, btnMisBoletos;

    private int[] numeros = new int[5];
    //private int[] estrellas = new int[2];
    private int contadorNumeros = 0;


    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        // IMAGEBUTTON
        imb01 = findViewById(R.id.imb01);
        imb02 = findViewById(R.id.imb02);
        imb03 = findViewById(R.id.imb03);
        imb04 = findViewById(R.id.imb04);
        imb05 = findViewById(R.id.imb05);
        imb06 = findViewById(R.id.imb06);
        imb07 = findViewById(R.id.imb07);
        imb08 = findViewById(R.id.imb08);
        imb09 = findViewById(R.id.imb09);
        imb10 = findViewById(R.id.imb10);
        imb11 = findViewById(R.id.imb11);
        imb12 = findViewById(R.id.imb12);
        imb13 = findViewById(R.id.imb13);
        imb14 = findViewById(R.id.imb14);
        imb15 = findViewById(R.id.imb15);
        imb16 = findViewById(R.id.imb16);
        imb17 = findViewById(R.id.imb17);
        imb18 = findViewById(R.id.imb18);
        imb19 = findViewById(R.id.imb19);
        imb20 = findViewById(R.id.imb20);
        imb21 = findViewById(R.id.imb21);
        imb22 = findViewById(R.id.imb22);
        imb23 = findViewById(R.id.imb23);
        imb24 = findViewById(R.id.imb24);
        imb25 = findViewById(R.id.imb25);
        imb26 = findViewById(R.id.imb26);
        imb27 = findViewById(R.id.imb27);
        imb28 = findViewById(R.id.imb28);
        imb29 = findViewById(R.id.imb29);
        imb30 = findViewById(R.id.imb30);
        imb31 = findViewById(R.id.imb31);
        imb32 = findViewById(R.id.imb32);
        imb33 = findViewById(R.id.imb33);
        imb34 = findViewById(R.id.imb34);
        imb35 = findViewById(R.id.imb35);
        imb36 = findViewById(R.id.imb36);
        imb37 = findViewById(R.id.imb37);
        imb38 = findViewById(R.id.imb38);
        imb39 = findViewById(R.id.imb39);
        imb40 = findViewById(R.id.imb40);
        imb41 = findViewById(R.id.imb41);
        imb42 = findViewById(R.id.imb42);
        imb43 = findViewById(R.id.imb43);
        imb44 = findViewById(R.id.imb44);
        imb45 = findViewById(R.id.imb45);
        imb46 = findViewById(R.id.imb46);
        imb47 = findViewById(R.id.imb47);
        imb48 = findViewById(R.id.imb48);
        imb49 = findViewById(R.id.imb49);
        imb50 = findViewById(R.id.imb50);


        //imagebutton estrellas
       /* imbStar1 = findViewById(R.id.imbStar1);
        imbStar2 = findViewById(R.id.imbStar2);*/

        // TEXTVIEW
        tv1Numero = findViewById(R.id.tv1Numero);
        tv2Reintegro = findViewById(R.id.tv2Reintegro);

        // BUTTON
        btnElegirNum = findViewById(R.id.btnElegirNum);
        btnBorrar = findViewById(R.id.btnBorrar);
        btnMisBoletos = findViewById(R.id.btnMisBoletos);


    }

    public void agregarNumero(View view) {
        // Obtener el ID del ImageButton pulsado
        int id = view.getId();

        // Extraer el nombre del imageButton del ID
        String resourceName = getResources().getResourceEntryName(id);

        // Obtener el número del nombre del imageButton
        String numero = resourceName.replaceAll("\\D", "");

        // Actualizar el TextView con el número elegido
        TextView tvNumero = findViewById(R.id.tv1Numero);
        String textoActual = tvNumero.getText().toString();

        if (!textoActual.contains(numero) && contadorNumeros < 5) { // Evitar duplicados
            tvNumero.setText(textoActual.isEmpty() ? numero : textoActual + " " + numero);
            numeros[contadorNumeros] = Integer.parseInt(numero);
            contadorNumeros++;

            // Cambiar backgroundTint del botón presionado
            view.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#018786")));

            if (contadorNumeros == 5) {
                Intent intent = new Intent(this, PBoletos.class);
                intent.putExtra("arrayNumBoleto", numeros);
                startActivity(intent);
            }

        }
    }

    public void borrar(View view) {
        tv1Numero.setText("");
        // Cambiar backgroundTint de los botones
        for (int i = 1; i <= 50; i++) {
            if (i < 10) {
                findViewById(getResources().getIdentifier("imb0" + i, "id", getPackageName())).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#CAC1EA")));
            } else {
                findViewById(getResources().getIdentifier("imb" + i, "id", getPackageName())).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#CAC1EA")));
            }
        }
        tv2Reintegro.setText("");
    }

    public void misBoletos(View view) {
        // Intent para abrir la actividad MisBoletos
        Intent intent = new Intent(this, PBoletos.class);
        startActivity(intent);
    }



}