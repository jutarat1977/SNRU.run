package snru.jutaratgift.snrurun;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Administrator on 17/5/2559.
 */
public class MyManage {

    //explicit
    private  MyOpenhelper myOpenhelper;
    private SQLiteDatabase sqLiteDatabase;

    public static final String user_table = "userTABLE";
    public static final String column_id = "_id";
    public static final String column_name = "name";
    public static final String column_user = "user";
    public static final String column_password = "password";
    public static final String column_avata = "avata";


    public MyManage(Context context) {

        myOpenhelper = new MyOpenhelper(context);
        sqLiteDatabase = myOpenhelper.getWritableDatabase();


    }   // Constructor

        public long addUser (String strName,
                            String strUser,
                            String strPassword,
                            String strAvata){
        ContentValues contentValues = new ContentValues();
            contentValues.put(column_name,strName);
            contentValues.put(column_user,strUser);
            contentValues.put(column_password,strPassword);
            contentValues.put(column_avata,strAvata);

        return sqLiteDatabase.insert(user_table,null,contentValues);

    }

} // Main Class
