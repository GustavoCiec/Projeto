package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button listarUsuario;

    Button mostrarUsuario;
    Button adUsuario;


    Banco.AcessoBD acessoBD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrarUsuario=findViewById(R.id.mostrarUsuario);
        adUsuario=findViewById(R.id.adUsuario);
        listarUsuario=findViewById(R.id.listarUsuario);

        acessoBD= new Banco.Banco(MainActivity.this);
        View.OnClickListener activity_usuario = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
        adUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Usuario usuario=null;

            }
        });

    }

}