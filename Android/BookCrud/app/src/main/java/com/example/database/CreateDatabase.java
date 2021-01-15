package com.example.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.environment.DatabaseConstants;

/**
 *  Responsible for creating the database
 */
public class CreateDatabase  extends SQLiteOpenHelper {

    public CreateDatabase(Context context) {
        super(context, DatabaseConstants.DATABASE, null, DatabaseConstants.VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {

        StringBuilder query = new StringBuilder();
        query.append("CREATE TABLE "+ DatabaseConstants.TABLE);
        query.append("(");
        query.append(DatabaseConstants.ID + " INTEGER PRIMARY KEY AUTOINCREMENT");
        query.append(DatabaseConstants.TITLE + " TEXT");
        query.append(DatabaseConstants.AUTHOR + " TEXT");
        query.append(DatabaseConstants.PUBLISHING_HOUSE + " TEXT");
        query.append(");");

        database.execSQL(query.toString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DatabaseConstants.TABLE);
        onCreate(sqLiteDatabase);
    }
}
