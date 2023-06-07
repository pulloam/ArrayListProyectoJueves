package com.example.arraylistproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cliente clienteUno = new Cliente("1-9");
        Cliente clienteDos = new Cliente("2-8", -10);

        clienteUno.setEdad(-10);

        Log.d("TAG_", "Rut " + clienteUno.getRut());

    }
}