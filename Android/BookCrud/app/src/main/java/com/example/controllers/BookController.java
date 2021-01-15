package com.example.controllers;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.database.CreateDatabase;
import com.example.environment.DatabaseConstants;

public class BookController {
    private SQLiteDatabase databaseContext;
    private CreateDatabase database;

    public BookController(Context context) {
        database = new CreateDatabase(context);
    }

    public String insertBook(String title, String author, String publishingHouse){
        long result;

        {
          databaseContext = database.getReadableDatabase();
          ContentValues contentValues = new ContentValues();
          contentValues.put(DatabaseConstants.TITLE, title);
          contentValues.put(DatabaseConstants.AUTHOR, author);
          contentValues.put(DatabaseConstants.PUBLISHING_HOUSE, publishingHouse);
          result = databaseContext.insert(DatabaseConstants.TABLE, null, contentValues);
          databaseContext.close();
        }

        if(result == -1)
            return "Erro ao inserir o dado";

        return "Inserido com sucesso";
    }
}
