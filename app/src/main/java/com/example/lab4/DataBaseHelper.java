package com.example.lab4;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String CUSTOMER_TABLE = "CUSTOMER_TABLE";
    public static final String COLUMN_ID = "COLUMN_ID";
    public static final String CUSTOMER_NAME = "CUSTOMER_NAME";
    public static final String CUSTOMER_AGE = "CUSTOMER_AGE";
    public static final String ACTIVITY_CUSTOMER = "ACTIVITY_CUSTOMER";

    public DataBaseHelper(@Nullable Context context) {
        super(context, "customer.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createTableStatement = "CREATE TABLE " + CUSTOMER_TABLE + "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + CUSTOMER_NAME + " TEXT, " + CUSTOMER_AGE + " INTEGER, " + ACTIVITY_CUSTOMER + " BOOLEAN)";
        sqLiteDatabase.execSQL(createTableStatement);
    }
    public boolean addOne(customerModel cm) {
        SQLiteDatabase db = getReadableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(COLUMN_ID,cm.getID());
        cv.put(CUSTOMER_AGE,cm.getAge());
        cv.put(CUSTOMER_NAME,cm.getName());
        cv.put(ACTIVITY_CUSTOMER,cm.isActive());

        long insert = db.insert(CUSTOMER_TABLE,null,cv);
        if(insert == -1)
            return false;
        return true;
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
