package com.example.personaldiary.views;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.personaldiary.MainActivity;
import com.example.personaldiary.R;
import com.example.personaldiary.sqlcommands.SqlCommands;
import com.example.personaldiary.models.Events;

public class EventDetail extends AppCompatActivity {
    private EditText titulo, descricao;
    private Button atualizar;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_detail);

        titulo = findViewById(R.id.et_titulo);
        descricao = findViewById(R.id.et_descricao_evento);
        atualizar = findViewById(R.id.btn_atualizar);

        getSupportActionBar().setTitle("Alterar dados do Evento");

        Intent intent = getIntent();
        final Events event = (Events) intent.getExtras().getSerializable("event");

        titulo.setText(event.getTitle());
        descricao.setText(event.getText());

        atualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Events newEvent = new Events();
                newEvent.setId(event.getId());
                newEvent.setText(titulo.getText().toString());
                newEvent.setTitle(descricao.getText().toString());

                db = openOrCreateDatabase("db_event", Context.MODE_PRIVATE, null);
                db.execSQL(SqlCommands.update(newEvent));

                startActivity(new Intent(getApplicationContext(), MainActivity.class));

                Toast.makeText(getApplicationContext(),"Atualizado com sucesso", Toast.LENGTH_LONG).show();
            }
        });
    }
}
