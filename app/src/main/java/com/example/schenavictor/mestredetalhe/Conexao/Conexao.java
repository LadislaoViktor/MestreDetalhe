package com.example.schenavictor.mestredetalhe.Conexao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 2015102617 on 17/04/2017.
 */
public class Conexao extends SQLiteOpenHelper {
    private final static String BASE = "cliente";
    private final static int VERSAO=1;

    public Conexao(Context context){
        super(context,BASE,null,VERSAO);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        String CRIA_TABELA_TELEFONE ="create table telefone("+
                "idtelefone integer primary key autoincrement," +
                "ddd text," +
                "telefone text," +
                "idcliente int null," +
                "constraint FKIdcliente foreign key(idcliente)references (cliente))";
        String CRIA_TABELA_CLIENTE = "create table cliente("+
                "id integer primary key autoincrement,"+
                "nome completo text,"+
                "rua text)";


        db.execSQL(CRIA_TABELA_CLIENTE);
        db.execSQL(CRIA_TABELA_TELEFONE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
