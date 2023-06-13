package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button listarUsuario;

    Button mostraUsuario;
    Button adUsuario;

    AcessoBD acessoBD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adUsuario=findViewById(R.id.adUsuario);
        mostraUsuario=findViewById(R.id.mostraUsuario);
        listarUsuario=findViewById(R.id.listarUsuario);

        acessoBD= new AcessoBD(MainActivity.this);
        mostrarUsuarioNaListView(acessoBD);
        adUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Usuario usuario=null;

            }
        });
    }
}