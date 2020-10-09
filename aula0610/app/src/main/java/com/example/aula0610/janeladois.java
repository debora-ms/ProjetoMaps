package com.example.aula0610;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;

public class janeladois extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        TextView texto = findViewById(R.id.meuTexto);
        TextView numer = findViewById(R.id.meuTexto2);
        //recuperar dados
        Bundle dados = getIntent().getExtras();
        String nome = dados.getString(key: "novotexto");
        int valor = dados.getInt(key: "novovalor");

        }
    }