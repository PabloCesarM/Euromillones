package com.example.euromillones;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PInicial extends AppCompatActivity {

    private Button btnComprar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p_inicial);

        btnComprar = findViewById(R.id.btnComprar);;
    }


    public void iraNumeros( View view) {
        // Intent para abrir la actividad MisBoletos
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }




}
