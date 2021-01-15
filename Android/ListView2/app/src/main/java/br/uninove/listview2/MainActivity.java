package br.uninove.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView saida;
    ListView listagem;
    Button btAdicionar;

    ArrayList<Aluno> listaalunos = new ArrayList<>();

    ArrayAdapter<Aluno> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listagem = findViewById(R.id.listagem);
        saida = findViewById(R.id.saida);
        btAdicionar = findViewById(R.id.btAdicionar);
        listaalunos.add(new Aluno("12","Pica-Pau","TADS", "MM"));
        listaalunos.add(new Aluno("56","Tio Patinhas","CC", "VG"));

        adaptador = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                listaalunos
        );

        listagem.setAdapter(adaptador);

        listagem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Aluno a = (Aluno) listagem.getItemAtPosition(position);
                saida.setText(a.getDados());
            }
        });

        btAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_insertion);
            }
        });

    }


}
