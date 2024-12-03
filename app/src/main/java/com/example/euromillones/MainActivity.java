package com.example.euromillones;

import android.content.res.ColorStateList;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.ImageButton;
import android.graphics.Color;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

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
        String numero = resourceName.replaceAll("\\D", ""); // Elimina todo excepto los dígitos

        // Actualizar el TextView con el número
        TextView tvNumero = findViewById(R.id.tv1Numero);
        tvNumero.setText(numero);

        // Cambiar el color de fondo del botón presionado
        view.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#018786")));
    }
}