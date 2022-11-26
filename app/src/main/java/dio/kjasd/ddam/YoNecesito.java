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

public class YoNecesito extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    TextToSpeech mTTS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yo_necesito);
        imageView = findViewById(R.id.yonecesitoview);
        textView = findViewById(R.id.yonecesitonecesito);
    }
    public void MensajeLeer(View view){
        imageView.setImageResource(R.drawable.yo_necesito_leerview);
        textView.setText("Yo necesito leer");
        Toast.makeText(this,"Yo necesito leer", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo necesito leer", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

    }
    public void MensajeTarea(View view){
        imageView.setImageResource(R.drawable.yo_necesito_hacer_tareaview);
        textView.setText("Yo necesito hacer tarea");
        Toast.makeText(this,"Yo necesito hacer tarea", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo necesito hacer tarea", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

    }
    public void MensajeEstudiar(View view){
        imageView.setImageResource(R.drawable.yo_necesito_estudiar_para_mi_examenview);
        textView.setText("Yo necesito estudiar para mi exámen");
        Toast.makeText(this,"Yo necesito estudiar para mi exámen", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo necesito estudiar para mi exámen", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

    }
    public void MensajeEscribir(View view){
        imageView.setImageResource(R.drawable.yo_necesito_escribirview);
        textView.setText("Yo necesito escribir");
        Toast.makeText(this,"Yo necesito escribir", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo necesito escribir", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

    }
    public void MensajeAyudat(View view){
        imageView.setImageResource(R.drawable.yo_necesito_ayuda_con_mi_tareaview);
        textView.setText("Yo necesito ayuda con mi tarea");
        Toast.makeText(this,"Yo necesito ayuda con mi tarea", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo necesito ayuda con mi tarea", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

    }
    public void MensajeCortar(View view){
        imageView.setImageResource(R.drawable.yo_necesito_cortar_imagenesview);
        textView.setText("Yo necesito cortar imágenes");
        Toast.makeText(this,"Yo necesito cortar imágenes", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo necesito cortar imágenes", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

    }
    public void MensajeMatematica(View view){
        imageView.setImageResource(R.drawable.yo_necesito_practicar_matematicaview);
        textView.setText("Yo necesito practicar matematicas");
        Toast.makeText(this,"Yo necesito practicar matematicas", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo necesito practicar matematicas", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

    }
    public void MensajeMemorizar(View view){
        imageView.setImageResource(R.drawable.yo_necesito_memorizarview);
        textView.setText("Yo necesito memorizar");
        Toast.makeText(this,"Yo necesito memorizar", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo necesito memorizar", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

    }
}