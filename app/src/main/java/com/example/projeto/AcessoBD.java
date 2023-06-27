package com.example.projeto;

import androidx.annotation.Nullable;
import com.example.projeto.Banco;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Banco extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "cadastro.db";
    protected static final String TABELA_USUARIO = "TABELA_USUARIO";

    protected static final String USUARIO_ID="ID";

    protected static final String USUARIO_NOME="USUARIO_NOME";

    protected static final String USUARIO_IDADE="USUARIO_IDADE";

    public Banco(@Nullable Context context) {
        super(context, DATABASE_NAME , null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db){
        String statement="CREATE TABLE " + TABELA_USUARIO +
                "(" + USUARIO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + USUARIO_NOME + "TEXT, " + USUARIO_IDADE + " INT)";
        db.execSQL(statement);
    }



    public void onUpdate(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("SELECT*FROM TABELA_USUARIO");
        onCreate(db);
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