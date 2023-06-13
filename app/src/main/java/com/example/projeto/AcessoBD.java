package com.example.projeto;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

public class AcessoBD extends SQLiteOpenHelper {

    protected static final String TABELA_USUARIO = "TABELA_USUARIO";

    protected static final String USUARIO_ID="ID";

    protected static final String USUARIO_NOME="USUARIO_NOME";

    protected static final String USUARIO_IDADE="USUARIO_IDADE";

    public AcessoBD(@Nullable Context context) {super(context, "ClienteBD" , null, 1);}

    @Override
    public void onCreate(SQLiteDatabase db){
        String statement="CREATE TABLE " + TABELA_USUARIO +
                "(" + USUARIO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + USUARIO_NOME + "TEXT, " + USUARIO_IDADE + " INT)";
        db.execSQL(statement);
    }



    public void onUpdate(SQLiteOpenHelper db, int oldVersion, int newVersion){

    }

    public boolean adcionarUsuario(Usuario usuario){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(USUARIO_NOME, usuario.getNomeUsuario());
        contentValues.put(USUARIO_IDADE, usuario.getIdadeUsuario());

        long inserirSucedido=db.insert(TABELA_USUARIO,null,contentValues);
        db.close();
        return  inserirSucedido!=-1;
    }
}