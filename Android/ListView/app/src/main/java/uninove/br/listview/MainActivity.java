package uninove.br.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.R.layout;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button save, desc, asc;
    ListView listNames;
    ArrayList<String> people = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.et_nome);
        save = findViewById(R.id.btn_salvar);
        listNames = findViewById(R.id.listaNomes);
        desc = findViewById(R.id.btn_desc);
        asc = findViewById(R.id.btn_asc);

        // Responsável por ligar o listview com minha lista de dados
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, //Context
                layout.simple_list_item_1, // ListView
                people // Fonte de dados
        );

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                people.add(0, name.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

        // Anexa o adaptador na listview
        listNames.setAdapter(adapter);

        listNames.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = (String) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),
                        "Nome: "+name,
                        Toast.LENGTH_LONG).show();
            }
        });

        listNames.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long id) {
                people.remove(position);
                adapter.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(),
                        "Item removido",
                        Toast.LENGTH_LONG).show();
                return false;
            }
        });

        asc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.sort(people);
                adapter.notifyDataSetChanged();
            }
        });

        desc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.sort(people, Collections.<String>reverseOrder());
                adapter.notifyDataSetChanged();
            }
        });
    }
}