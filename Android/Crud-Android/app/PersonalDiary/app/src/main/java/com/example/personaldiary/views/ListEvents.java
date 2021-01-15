package com.example.personaldiary.views;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.personaldiary.R;
import com.example.personaldiary.sqlcommands.SqlCommands;
import com.example.personaldiary.utils.MakeToastTexts;
import com.example.personaldiary.utils.Messages;
import com.example.personaldiary.models.Events;
import java.util.ArrayList;

public class ListEvents extends AppCompatActivity {
    private ListView listEvents;
    private SQLiteDatabase db;
    private ArrayList<Events> eventsList = new ArrayList<Events>();
    private ArrayAdapter<Events> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        listEvents = findViewById(R.id.list_events);

        getSupportActionBar().setTitle("Listar Eventos");

        eventsList.clear();
        db = openOrCreateDatabase("db_event", Context.MODE_PRIVATE, null);

        Cursor cursor = db.rawQuery(SqlCommands.select("event", "order by id"), null);

        while (cursor.moveToNext()) {
            eventsList.add(new Events(
                            cursor.getInt(0),
                            cursor.getString(1),
                            cursor.getString(2)));
        }

        adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, eventsList);

        listEvents.setAdapter(adapter);

        listEvents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Events event = (Events) listEvents.getItemAtPosition(position);

                Intent intent = new Intent(getApplicationContext(), EventDetail.class);
                intent.putExtra("event", event);
                startActivity(intent);
            }
        });

        listEvents.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Events event = (Events) listEvents.getItemAtPosition(position);

                db.delete("event",SqlCommands.whereDelete(event),null);
                eventsList.remove(event);
                adapter.notifyDataSetChanged();

                MakeToastTexts.makeText(Messages.Delete.getMessageText(),getApplicationContext());

                return true;
            }
        });
    }
}
