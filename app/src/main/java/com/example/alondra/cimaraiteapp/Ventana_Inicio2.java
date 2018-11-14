package com.example.alondra.cimaraiteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ventana_Inicio2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana__inicio2);
    }

    //Para probar boton IS
    public void abrirElegirUsuario(View v)
    {
        //Forma para ligar una act con el boton al dar click
        Intent intent = new Intent(getApplicationContext(),Ventana_ElegirUsuario.class);
        startActivity(intent);
    }
}
