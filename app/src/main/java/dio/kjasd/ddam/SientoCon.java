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

public class SientoCon extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    TextToSpeech mTTS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siento_con);

        imageView = findViewById(R.id.mesientoconimg);
        textView = findViewById(R.id.mesientocontxt);
    }

    public void MensajeGripe(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_con_gripeview);
        textView.setText("Yo me siento con gripe");
        Toast.makeText(this,"Yo me siento con gripe", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento con gripe", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

    }
    public void MensajeGarganta(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_con_dolor_de_gargantaview);
        textView.setText("Yo me siento con dolor de garganta");
        Toast.makeText(this,"Yo me siento con dolor de garganta", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento con dolor de garganta", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeEspalda(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_con_dolor_de_espaldaview);
        textView.setText("Yo me siento con dolor de espalda");
        Toast.makeText(this,"Yo me siento con dolor de espalda", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento con dolor de espalda", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeCorazon(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_con_dolor_de_corazonview);
        textView.setText("Yo me siento con dolor en el corazón");
        Toast.makeText(this,"Yo me siento con dolor en el corazón", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento con dolor en el corazón", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeEstomago(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_con_dolor_de_estomagoview);
        textView.setText("Yo me siento con dolor de estómago");
        Toast.makeText(this,"Yo me siento con dolor de estómago", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento con dolor de estómago", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeCabeza(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_con_dolor_de_cabezaview);
        textView.setText("Yo me siento con dolor de cabeza");
        Toast.makeText(this,"Yo me siento con dolor de cabeza", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento con dolor de cabeza", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeMuela(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_con_dolor_de_muelaview);
        textView.setText("Yo me siento con dolor de muela");
        Toast.makeText(this,"Yo me siento con dolor de muela", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento con dolor de muela", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeOido(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_con_dolor_de_oidoview);
        textView.setText("Yo me siento con dolor de oído");
        Toast.makeText(this,"Yo me siento con dolor de oído", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento con dolor de oído", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
}