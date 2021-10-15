package com.example.impintentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class welcome extends AppCompatActivity {
    TextView halo;
    private String nama;
    private String KEY_NAME = "NAMA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        halo = (TextView) findViewById(R.id.txtHello);
        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        halo.setText("Hola, " + nama + " !");
    }
}
