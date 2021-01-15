package com.example.personaldiary.views;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.example.personaldiary.MainActivity;
import com.example.personaldiary.R;
import com.example.personaldiary.sqlcommands.SqlCommands;
import com.example.personaldiary.utils.MakeToastTexts;
import com.example.personaldiary.utils.Messages;
import com.example.personaldiary.models.Events;

public class AddEvent extends AppCompatActivity {
    private Button save;
    private EditText tituloEvento, descricaoEvento;
    private SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diary);

        save = findViewById(R.id.btn_salvar);
        tituloEvento = findViewById(R.id.et_titulo);
        descricaoEvento = findViewById(R.id.et_descricao_evento);

        getSupportActionBar().setTitle("Cadastrar Evento");

        db = openOrCreateDatabase("db_event", Context.MODE_PRIVATE, null);
        db.execSQL(SqlCommands.CREATE_DATABASE);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Events event = new Events(tituloEvento.getText().toString(), descricaoEvento.getText().toString());

                ContentValues values = new ContentValues();
                values.put("titleEvent", event.getTitle());
                values.put("descriptionEvent", event.getText());

                db.insert("event", null, values);

                startActivity(new Intent(getApplicationContext(), MainActivity.class));

                MakeToastTexts.makeText(Messages.Save.getMessageText(), getApplicationContext());
            }
        });
    }
}
