package com.example.euromillones;

import android.content.res.ColorStateList;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.graphics.Color;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    // todos los elementos que hay que declarar
    // TEXTVIEW
    private TextView tv1Numero, tv2Reintegro;

    // IMAGEBUTTON
    private ImageButton imb01, imb02, imb03, imb04, imb05, imb06, imb07, imb08, imb09, imb10, imb11, imb12, imb13, imb14, imb15, imb16, imb17, imb18, imb19, imb20;
    private ImageButton imb21, imb22, imb23, imb24, imb25, imb26, imb27, imb28, imb29, imb30, imb31, imb32, imb33, imb34, imb35, imb36, imb37, imb38, imb39, imb40;
    private ImageButton imb41, imb42, imb43, imb44, imb45, imb46, imb47, imb48, imb49, imb50;
    //BUTTON
    private Button btnElegirNum, btnBorrar, btnMisBoletos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);








    }

    public void onClick(View view) {
        // Obtener el ID del ImageButton pulsado
        int id = view.getId();

        // Extraer el nombre del recurso del ID
        String resourceName = getResources().getResourceEntryName(id);

        // sacar el numero
        String numero = resourceName.replaceAll("\\D", "");

        // Escribir en el TextView donde se muestra el número elegido
        TextView tvNumero = findViewById(R.id.tv1Numero);
        tvNumero.setText(numero);

        // Cambiar backgroundTint
        view.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#018786")));
    }
}