package com.example.auladehoje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Screen extends AppCompatActivity {
    public String fullname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
    }
    public void show(View view) {
        Intent intent=getIntent();
        fullname = intent.getStringExtra("msg");
        Context context = getApplicationContext();
        CharSequence text = fullname;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}