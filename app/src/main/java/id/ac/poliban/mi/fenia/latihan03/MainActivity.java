package id.ac.poliban.mi.fenia.latihan03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        //event listener & event Handler
        //menggunakan lamda expression
        Button btArsenal = findViewById(R.id.btArsenal);
        Button btPorto = findViewById(R.id.btPorto);
        Button btBarcelona = findViewById(R.id.btBarcelona);
        Button btColo = findViewById(R.id.btColoColo);
        Button btBoca = findViewById(R.id.btBocaJunior);
        Button btFiorentina = findViewById(R.id.btFiorentina);

        btArsenal.setOnClickListener(v -> Toast.makeText(this, "Arsenal : 1886", Toast.LENGTH_SHORT).show());
        btPorto.setOnClickListener(v -> Toast.makeText(this, "Porto : 1893", Toast.LENGTH_SHORT).show());
        btBarcelona.setOnClickListener(v -> Toast.makeText(this, "Barcelona : 1899", Toast.LENGTH_SHORT).show());
        btColo.setOnClickListener(v -> Toast.makeText(this, "Colo-Colo : 1925", Toast.LENGTH_SHORT).show());
        btBoca.setOnClickListener(v -> Toast.makeText(this, "Boca Junior : 1905", Toast.LENGTH_SHORT).show());
        btFiorentina.setOnClickListener(v -> Toast.makeText(this, "Fiorentina : 1826", Toast.LENGTH_SHORT).show());

        finish();//aplikasi dihancurkan
    }
}
