package com.example.personaldiary;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.personaldiary.views.AddEvent;
import com.example.personaldiary.views.ListEvents;

public class MainActivity extends AppCompatActivity {
    private Button listItens, addItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listItens = findViewById(R.id.btn_listar_tarefas);
        addItem = findViewById(R.id.btn_nova_terefa);

        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddEvent.class);
                startActivity(intent);
            }
        });

        listItens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ListEvents.class);
                startActivity(intent);
            }
        });

    }
}
