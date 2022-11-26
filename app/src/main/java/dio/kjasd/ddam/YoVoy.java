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

public class YoVoy extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    TextToSpeech mTTS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yo_voy);
        imageView = findViewById(R.id.yovoyview);
        textView = findViewById(R.id.yovoyvoy);
    }

    public void MensajeEscuela(View view){
        imageView.setImageResource(R.drawable.yo_voy_a_la_escuelaview);
        textView.setText("Yo voy a la escuela");
        Toast.makeText(this,"Yo voy a la escuela", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo voy a la escuela", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

    }
    public void MensajeParque(View view){
        imageView.setImageResource(R.drawable.yo_voy_al_parqueview);
        textView.setText("Yo voy al parque");
        Toast.makeText(this,"Yo voy al parque", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo voy al parque", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeCine(View view){
        imageView.setImageResource(R.drawable.yo_voy_al_cineview);
        textView.setText("Yo voy al cine");
        Toast.makeText(this,"Yo voy al cine", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo voy al cine", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeAbuelos(View view){
        imageView.setImageResource(R.drawable.yo_voy_al_la_casa_de_mis_abuelosview);
        textView.setText("Yo voy a la casa de mis abuelos");
        Toast.makeText(this,"Yo voy a la casa de mis abuelos", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo voy a la casa de mis abuelos", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeAmigos(View view){
        imageView.setImageResource(R.drawable.yo_voy_a_la_casa_de_mis_amigosview);
        textView.setText("Yo voy a la casa de mis amigos");
        Toast.makeText(this,"Yo voy a la casa de mis amigos", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo voy a la casa de mis amigos", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeJuegos(View view){
        imageView.setImageResource(R.drawable.yo_voy_a_los_juegossview);
        textView.setText("Yo voy a los juegos");
        Toast.makeText(this,"Yo voy a los juegos", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo voy a los juegos", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeCasa(View view){
        imageView.setImageResource(R.drawable.yo_voy_a_mi_casaview);
        textView.setText("Yo voy a mi casa");
        Toast.makeText(this,"Yo voy a mi casa", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo voy a mi casa", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeAjugar(View view){
        imageView.setImageResource(R.drawable.yo_voy_a_jugarview);
        textView.setText("Yo voy a jugar");
        Toast.makeText(this,"Yo voy a jugar", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo voy a jugar", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
}