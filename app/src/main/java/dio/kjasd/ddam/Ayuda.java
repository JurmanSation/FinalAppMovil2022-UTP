package dio.kjasd.ddam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Ayuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda);

        Bundle bundle=getIntent().getExtras();
        if (bundle != null){
            if (bundle.getString("some")!=null){
                Toast.makeText(getApplicationContext(),
                        "data:"+bundle.getString("some"),Toast.LENGTH_SHORT);
            }
        }
    }
    public void callAyuda_Hablemos(View view) {
        Toast.makeText(Ayuda.this, "Ayuda para Texto a Voz", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Ayuda.this, Ayuda_Hablemos.class);
        startActivity(intent);
    }

    public void callAyuda_Pictograma(View view) {
        Toast.makeText(Ayuda.this, "Ayuda para Pictogramas", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Ayuda.this, Ayuda_Pictogramas.class);
        startActivity(intent);
    }

}