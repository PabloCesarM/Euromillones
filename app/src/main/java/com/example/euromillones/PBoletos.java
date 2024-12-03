package com.example.euromillones;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PBoletos extends AppCompatActivity {


    private Button btnComprar, btnComprobar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p_inicial);

        btnComprar = findViewById(R.id.btnComprar);
        btnComprobar = findViewById(R.id.btnComprobar);
    }

}
