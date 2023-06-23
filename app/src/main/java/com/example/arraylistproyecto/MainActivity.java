package com.example.arraylistproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnAceptar, btnCliente;
    //Arreglo
    private String[] nombres = new String[100];
    //Listas ArrayList
    private ArrayList<String> losNombres = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        referencias();
        eventos();

        poblarArrayList();

    }

    private void eventos() {
        btnCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cliente cliente = new Cliente("10-8", "Juanito", 34);

                Intent i = new Intent(MainActivity.this, ClienteActivity.class);
                i.putExtra("rut", "1-9");
                i.putExtra("edad", 10);
                i.putExtra("cliente", cliente);

                startActivity(i);
            }
        });
    }

    private void referencias() {
        btnCliente = findViewById(R.id.btnCliente);
    }

    private void poblarArrayList() {
        for(int x = 0; x <= 1000000; ++x) {
            losNombres.add("nombre " + x);
        }

        Log.d("TAG_", "Terminó");
        losNombres.remove(1);

    }



}