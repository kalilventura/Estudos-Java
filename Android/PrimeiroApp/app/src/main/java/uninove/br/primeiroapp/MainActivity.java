package uninove.br.primeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText firstName, lastName;
    TextView validatename, validatelastname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn_show_name);
        firstName = (EditText) findViewById(R.id.editText);
        lastName = (EditText) findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!nameIsValid())
                    showInvalidAlert();
                else
                    showName(firstName.getText().toString(), lastName.getText().toString());
            }
        });
    }

    public boolean nameIsValid(){
        setValidateFieldsVisible();
        return (firstName.length() > 0) && (lastName.length() > 0);
    }

    public void showName(String firstName, String lastName) {
        setValidateFieldsInvisible();
        String name = "Hello, your name is "+ firstName + " " + lastName;
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();

    }

    public void showInvalidAlert() {
        String message = "Name Invalid";
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    public void setValidateFieldsInvisible(){
        validatename.setVisibility(View.INVISIBLE);
        validatelastname.setVisibility(View.INVISIBLE);
    }

    public void setValidateFieldsVisible(){
        validatename.setVisibility(View.VISIBLE);
        validatelastname.setVisibility(View.VISIBLE);
    }
}
