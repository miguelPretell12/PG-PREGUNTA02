package proyectos.create.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txt_nombre, txt_apellido, txt_genero, txt_edad, txt_direccion, txt_telefono;
    Button btn_enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_enviar = findViewById(R.id.btn_enviar);
        txt_nombre = findViewById(R.id.txt_nombre);
        txt_apellido = findViewById(R.id.txt_Apellido);
        txt_genero = findViewById(R.id.txt_genero);
        txt_edad = findViewById(R.id.txt_edad);
        txt_direccion = findViewById(R.id.txt_direccion);
        txt_telefono = findViewById(R.id.txt_telefono);

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviar();
            }
        });

    }

    public void enviar(){
        String nombre = txt_nombre.getText().toString();
        String apellido = txt_apellido.getText().toString();
        String genero = txt_genero.getText().toString();
        int edad = Integer.parseInt(txt_edad.getText().toString());
        String direccion = txt_direccion.getText().toString();
        String telefono = txt_telefono.getText().toString();

        Intent intentMensaje = new Intent(MainActivity.this, mostrarMensaje.class);
        intentMensaje.putExtra("nombre",nombre);
        intentMensaje.putExtra("apellido",apellido);
        intentMensaje.putExtra("genero",genero);
        intentMensaje.putExtra("edad",edad);
        intentMensaje.putExtra("direccion",direccion);
        intentMensaje.putExtra("telefono",telefono);
        startActivity(intentMensaje);
    }
}