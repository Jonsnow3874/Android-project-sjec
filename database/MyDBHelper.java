package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "user.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "usertable";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_NO = "mobile";
    private static final String COLUMN_CITY = "address";

    public MyDBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_NAME + " TEXT," +
                COLUMN_NO + " TEXT," +
                COLUMN_CITY + " TEXT)";
        sqLiteDatabase.execSQL(CREATE_TABLE);  // Use the sqLiteDatabase parameter
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);  // Use the sqLiteDatabase parameter
        onCreate(sqLiteDatabase);
    }

    public boolean insertData(String name, String mobile, String address) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();  // Use consistent variable name
        values.put(COLUMN_NAME, name);
        values.put(COLUMN_NO, mobile);
        values.put(COLUMN_CITY, address);
        long result = db.insert(TABLE_NAME, null, values);
        return result != -1;
    }

    public Cursor getdata() {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
    }
}
