package com.example.arraylistproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ClienteActivity extends AppCompatActivity {
    private Button btnVolver, btnMarcar, btnGrabar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        btnVolver = findViewById(R.id.btnVolver);
        btnMarcar = findViewById(R.id.btnMarcar);
        btnGrabar = findViewById(R.id.btnGrabarShare);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnMarcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+5695555555"));
                //Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
                //Intent i = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:jsmith@example.com"));
                //startActivity(i);
            }
        });

        btnGrabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferencias = getSharedPreferences("cliente", Context.MODE_PRIVATE);

                SharedPreferences.Editor editar = preferencias.edit();

                editar.putString("rut_dos", "10-8");
                editar.putInt("edad_dos", 45);

                editar.commit();


            }
        });



        Bundle bundle  = getIntent().getExtras();

        if(bundle != null){
            String rut = bundle.getString("rut", "n/a");
            int edad = bundle.getInt("edad", -1);

            Log.d("TAG_", "Rut : " + rut);
            Log.d("TAG_", "Edad : " + edad);

            Cliente clienteEnviado = (Cliente) bundle.getSerializable("cliente");

            Log.d("TAG_", clienteEnviado.getRut());
            Log.d("TAG_", clienteEnviado.getNombre());
            Log.d("TAG_", String.valueOf(clienteEnviado.getEdad()));


        }
    }
}