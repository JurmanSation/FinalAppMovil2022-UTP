package dio.kjasd.ddam;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MisNecesidades extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    TextToSpeech mTTS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_necesidades);
        imageView = findViewById(R.id.necesidadesview);
        textView = findViewById(R.id.Misnecesidadesnecesidades);
    }
    public void MensajeBanio2(View view){
        imageView.setImageResource(R.drawable.necesito_ir_al_banioview);
        textView.setText("Necesito ir al baño");
        Toast.makeText(this,"Necesito ir al baño", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Necesito ir al baño", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

    }
    public void MensajePeinarme(View view){
        imageView.setImageResource(R.drawable.necesito_peinarmeview);
        textView.setText("Necesito peinarme");
        Toast.makeText(this,"Necesito peinarme", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Necesito peinarme", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeCepillarme(View view){
        imageView.setImageResource(R.drawable.necesito_cepillarme_los_dientesview);
        textView.setText("Necesito cepillarme los dientes");
        Toast.makeText(this,"Necesito cepillarme los dientes", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Necesito cepillarme los dientes", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeBaniarme2(View view){
        imageView.setImageResource(R.drawable.necesito_baniarmeview);
        textView.setText("Necesito bañarme");
        Toast.makeText(this,"Necesito bañarme", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Necesito bañarme", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeJabon(View view){
        imageView.setImageResource(R.drawable.necesito_usar_jabonview);
        textView.setText("Necesito usar jabón");
        Toast.makeText(this,"Necesito usar jabón", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Necesito usar jabón", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeShampoo(View view){
        imageView.setImageResource(R.drawable.necesito_usar_shampooview);
        textView.setText("Necesito usar shampoo");
        Toast.makeText(this,"Necesito usar shampoo", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Necesito usar shampoo", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeLavarme(View view){
        imageView.setImageResource(R.drawable.necesito_lavarme_la_caraview);
        textView.setText("Yo necesito lavarme la cara");
        Toast.makeText(this,"Necesito lavarme la cara", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo necesito lavarme la cara", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeSos(View view){
        imageView.setImageResource(R.drawable.necesito_ayuda);
        textView.setText("Necesito ayuda");
        Toast.makeText(this,"Necesito ayuda", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Necesito ayuda", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
}