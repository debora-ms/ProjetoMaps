package com.example.aula0610;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int tex;
        Toast.makeText(getApplicationContext(), text:"teste onCreate", Toast.LENGTH_SHORT).show();
    }
    private void AcaoParaBotao(View v) {
        Intent jan = new Intent(getApplicationContext(), Janeladois.class);
        jan.putExtra(name:"novotexto", value:"kkkkkkkkkkk");
        jan.putExtra(name:"novovalor", value:40);
        startActivity(jan);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(), text:"teste onStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(), text:"teste onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(), text:"teste onPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(), text:"teste onStop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(), text:"teste onDestroy", Toast.LENGTH_SHORT).show();
    }
}