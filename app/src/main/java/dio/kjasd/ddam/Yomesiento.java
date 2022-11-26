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

public class Yomesiento extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    TextToSpeech mTTS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yomesiento);

        imageView = findViewById(R.id.mesientoview);
        textView = findViewById(R.id.yomesientisiento);
    }

    public void MensajeFeliz(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_felizview);
        textView.setText("Yo me siento feliz");
        Toast.makeText(this,"Yo me siento feliz", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento feliz", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

    }
    public void MensajeTriste(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_tristeview);
        textView.setText("Yo me siento triste");
        Toast.makeText(this,"Yo me siento triste ", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento triste", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeEnojado(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_enojadoview);
        textView.setText("Yo me siento enojado");
        Toast.makeText(this,"Yo me siento enojado", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento enojado", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeSorprendido(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_sorprendidoview);
        textView.setText("Yo me siento sorprendido");
        Toast.makeText(this,"Yo me siento sorprendido", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento sorprendido", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeCansado(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_cansadoview);
        textView.setText("Yo me siento cansado");
        Toast.makeText(this,"Yo me siento cansado", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento cansado", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeTranquilo(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_tranquiloview);
        textView.setText("Yo me siento tranquilo");
        Toast.makeText(this,"Yo me siento tranquilo", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento tranquilo", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeAsustado(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_asustadoview);
        textView.setText("Yo me siento asustado");
        Toast.makeText(this,"Yo me siento asustado", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento asustado", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeAburrido(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_aburridoview);
        textView.setText("Yo me siento aburrido");
        Toast.makeText(this,"Yo me siento aburrido", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento aburrido", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }

    public void MensajeHambriento(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_hambrientoview);
        textView.setText("Yo me siento hambriento");
        Toast.makeText(this,"Yo me siento hambriento", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento hambriento", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeAvergonzado(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_avergonzadoview);
        textView.setText("Yo me siento avergonzado");
        Toast.makeText(this,"Yo me siento avergonzado", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento avergonzado", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
    public void MensajeEnfermo(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_tristeview);
        textView.setText("Yo me siento enfermo");

        Toast.makeText(this,"Yo me siento enfermo", Toast.LENGTH_SHORT).show();
        mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak("Yo me siento enfermo", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }

}