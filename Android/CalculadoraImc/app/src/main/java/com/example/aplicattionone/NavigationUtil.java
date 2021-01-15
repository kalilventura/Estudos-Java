package com.example.aplicattionone;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/*
* Classe criada para fazer as navegações entre as activities
* */
public class NavigationUtil {

    /**
     * Navegar entre Activities passando dados
     * */
    public static void changeActivity(Context context, Class activity, Bundle bundle){
            Intent intent = new Intent(context, activity);
            intent.putExtras(bundle);
            context.startActivity(intent);
    }

    /**
     * Navegar entre Activities
     * */
    public static void changeActivity(Context context, Class activity){
        Intent intent = new Intent(context, activity);
        context.startActivity(intent);
    }
}
