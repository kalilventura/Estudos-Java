package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.controllers.BookController;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText title, author, publishHouse;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        title = (EditText)findViewById(R.id.editText);
        author = (EditText)findViewById((R.id.editText2));
        publishHouse = (EditText)findViewById(R.id.editText3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BookController bookController = new BookController(getBaseContext());
                String insertTitle = title.getText().toString();
                String insertAuthor = author.getText().toString();
                String insertPublishingHouse = publishHouse.getText().toString();
                result = bookController.insertBook(insertTitle, insertAuthor, insertPublishingHouse);

                writeMessage(result);
            }
        });

    }

    private void writeMessage(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}
