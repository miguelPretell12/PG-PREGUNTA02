package proyectos.create.parcial;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mostrarMensaje extends AppCompatActivity {
    TextView txt_nombre, txt_apellido, txt_genero, txt_edad, txt_direccion, txt_telefono;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrardatos);
        recibirDatos();
    }

    private void recibirDatos(){
        Bundle receptor = getIntent().getExtras();

        String nombre = receptor.getString("nombre");
        String apellido = receptor.getString("apellido");
        String genero = receptor.getString("genero");
        String edad = receptor.getString("eda");
        String telefono = receptor.getString("telefono");
        String direccion = receptor.getString("direccion");

        txt_nombre = findViewById(R.id.txt_nombre);
        txt_apellido = findViewById(R.id.txt_Apellido);
        txt_genero = findViewById(R.id.txt_genero);
        txt_edad = findViewById(R.id.txt_edad);
        txt_direccion = findViewById(R.id.txt_direccion);
        txt_telefono = findViewById(R.id.txt_telefono);

        txt_nombre.setText(nombre);
        txt_apellido.setText(apellido);
        txt_genero.setText(genero);
        txt_edad.setText(edad);
        txt_telefono.setText(telefono);
        txt_direccion.setText(direccion);
    }
}
