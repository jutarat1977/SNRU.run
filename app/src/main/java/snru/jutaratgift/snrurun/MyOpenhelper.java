package snru.jutaratgift.snrurun;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 17/5/2559.
 */
public class MyOpenhelper extends SQLiteOpenHelper{

    //Explicit
    public  static final String database_name = "Snru.db";
    private static final int database_version =1;

    private static final String creata_user_table = "create table userTABLE(" +
            "_id integer primary key," +
            "Name text," +
            "User text," +
            "Password text," +
            "Avata text);";



    public MyOpenhelper(Context context ) {
        super(context,database_name,null,database_version);
    }   // Construtor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(creata_user_table);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}   // Main class
