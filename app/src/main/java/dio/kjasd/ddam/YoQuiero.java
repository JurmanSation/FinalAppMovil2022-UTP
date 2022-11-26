package dio.kjasd.ddam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class YoQuiero extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    TextToSpeech mTTS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yo_quiero);


        imageView = findViewById(R.id.quieroview);
        textView = findViewById(R.id.yoquieroquiero);
    }


    public void MensajeComer(View view) {
        //cambio de imagen
        imageView.setImageResource(R.drawable.yo_quiero_comerview);
        //Cambio de texto
        textView.setText("Yo quiero comer");
        //Toast
        Toast.makeText(this, "Yo quiero comer", Toast.LENGTH_SHORT).show();
        //Voz
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo quiero Comer", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });


    }

    public void Mensajebeber(View view){
        imageView.setImageResource(R.drawable.yo_quiero_beberview);
        textView.setText("Yo quiero beber");
        Toast.makeText(this,"Yo quiero beber ", Toast.LENGTH_SHORT).show();

        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo quiero Beber", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }

    public void Mensajebanio(View view){
        imageView.setImageResource(R.drawable.yo_quiero_ir_al_banioview);
        textView.setText("Yo quiero ir al baño");
        Toast.makeText(this,"Yo quiero ir al baño", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo quiero ir al baño", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void Mensajejugar(View view){
        imageView.setImageResource(R.drawable.yo_quiero_jugarview);
        textView.setText("Yo quiero jugar");
        Toast.makeText(this,"Yo quiero jugar", Toast.LENGTH_SHORT).show();

        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo quiero jugar", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void Mensajedormir(View view){
        imageView.setImageResource(R.drawable.yo_quiero_dormirview);
        textView.setText("Yo quiero dormir");
        Toast.makeText(this,"Yo quiero dormir", Toast.LENGTH_SHORT).show();

        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo quiero dormir", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void Mensajebaniarme(View view){
        imageView.setImageResource(R.drawable.yo_quiero_baniarmeview);
        textView.setText("Yo quiero bañarme");
        Toast.makeText(this,"Yo quiero bañarme", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo quiero bañarme", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void Mensajehablar(View view){
        imageView.setImageResource(R.drawable.yo_quiero_hablarview);
        textView.setText("Yo quiero Conversar");
        Toast.makeText(this,"Yo quiero hablar", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo quiero conversar", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeCaminar(View view){
        imageView.setImageResource(R.drawable.yo_quiero_caminarview);
        textView.setText("Yo quiero caminar");
        Toast.makeText(this,"Yo quiero caminar", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo quiero caminar", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
}