package com.example.personaldiary.utils;

import android.content.Context;
import android.widget.Toast;

public class MakeToastTexts {
    public static void makeText(String message, Context context) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
