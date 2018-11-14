package com.example.alondra.cimaraiteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Para probar boton Sign-in
    public void abrirInicio2(View v)
    {
        //Forma para ligar una act con el boton al dar click
        Intent intent = new Intent(getApplicationContext(),Ventana_Inicio2.class);
        startActivity(intent);
    }
}
