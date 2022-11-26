package dio.kjasd.ddam.ui.hablemos;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import java.util.Locale;

import dio.kjasd.ddam.GLOBAL;
import dio.kjasd.ddam.MyAPIAdapter;
import dio.kjasd.ddam.PalabrasFavoritas;
import dio.kjasd.ddam.R;
import dio.kjasd.ddam.UResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HablemosFragment extends Fragment {
    private TextToSpeech mTTS;
    private EditText mEditText;
    private SeekBar mSeekBarVel;
    private SeekBar mSeekBarTon;
    private Button mButtonSpeak;
    private Button btnFavoritos;
    private Button btnLimpiar;

    private HablemosViewModel mViewModel;

    public static HablemosFragment newInstance() {
        return new HablemosFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hablemos, container, false);




        btnFavoritos = view.findViewById(R.id.btnFavoritos);
        mEditText = view.findViewById(R.id.editTextH);

        btnFavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] Opciones = {"Guardar en Favoritos", "Ver Favoritos"};
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Seleccion que desea hacer")
                        .setItems(Opciones, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                if(which == 0){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                                    builder.setTitle("Ingrese una indetificador de la palabra");

                                    final EditText input = new EditText(getActivity());
                                    input.setInputType(InputType.TYPE_CLASS_TEXT);
                                    builder.setView(input);

                                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            if(GLOBAL.PalabrasFavoritas.size() < 8){
                                                String text = mEditText.getText().toString();
                                                String m_Text = input.getText().toString();
                                                Call<UResponse> call = MyAPIAdapter.getApiService().insertarPalabraFavorita(m_Text, GLOBAL.idUsuario,
                                                        text,GLOBAL.PalabrasFavoritas.size() + 1);
                                                call.enqueue(new Callback<UResponse>() {
                                                    @Override
                                                    public void onResponse(Call<UResponse> call, Response<UResponse> response) {
                                                        UResponse respuesta = response.body();
                                                        Boolean validacion = respuesta.getValidacion();
                                                        if(validacion){
                                                            GLOBAL.PalabrasFavoritas.add(new PalabrasFavoritas(m_Text, text, GLOBAL.PalabrasFavoritas.size() + 1));
                                                            Toast.makeText(getActivity(), "Se guardo correctamente", Toast.LENGTH_SHORT).show();
                                                        }
                                                    }

                                                    @Override
                                                    public void onFailure(Call<UResponse> call, Throwable t) {
                                                        Toast.makeText(getActivity(), "Hubo un error", Toast.LENGTH_SHORT).show();
                                                    }
                                                });
                                            }
                                        }
                                    });
                                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            dialog.cancel();
                                        }
                                    });

                                    builder.show();
                                }else{
                                    Fragment fragment = new FavoritosFragment();
                                    FragmentTransaction transaction = getActivity()
                                            .getSupportFragmentManager()
                                            .beginTransaction();

                                    transaction.replace(R.id.Hablemoscontainer,fragment)
                                            .commit();
                                }
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
        // nota de Diego xd nicializacion TextToSpeech dentro de OnCreate, usamos getActivity al ser fragment, usualmente se usa (this) en Activity

        mButtonSpeak = view.findViewById(R.id.btnHablar);

        mTTS = new TextToSpeech(getActivity() , new TextToSpeech.OnInitListener(){
            @Override
            public void onInit(int estado) {
                if (estado == TextToSpeech.SUCCESS){

                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    int result = mTTS.setLanguage(locSpanish);

                    if(result ==TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED){
                        Log.e("TTs","Lenguaje no soportado");
                    } else {
                        mButtonSpeak.setEnabled(true);
                    }
                } else {
                    Log.e("TTs","Inicializacion fallida");
                }
            }
        });

        //view.findView para encontrar en fragment
        mSeekBarTon = view.findViewById(R.id.seek_bar_tono);
        mSeekBarVel = view.findViewById(R.id.seek_bar_velocidad);

        mButtonSpeak.setOnClickListener(new  View.OnClickListener(){

            private void speak(){
                String text = mEditText.getText().toString();
                float tono = (float) mSeekBarTon.getProgress()/50;
                if (tono < 0.1) tono = 0.1f;

                float vel = (float) mSeekBarVel.getProgress()/50;
                if (vel < 0.1) vel = 0.1f;

                mTTS.setPitch(tono);
                mTTS.setSpeechRate(vel);

                mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

            }





            @Override
            public void onClick(View v) {
                speak();
            }
        });

        btnLimpiar = view.findViewById(R.id.btnLimpiar);
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Limpiar el EditText
                mEditText.setText("");
            }
        });





return view;




    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(HablemosViewModel.class);



    }
//detener servicio
    @Override
    public void onDestroy(){
        if (mTTS != null){
            mTTS.stop();
            mTTS.shutdown();
        }
        super.onDestroy();
    }



}