package dio.kjasd.ddam;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import dio.kjasd.ddam.databinding.ActivityMainBinding;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LogIn extends AppCompatActivity{
    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        EditText text = (EditText)findViewById(R.id.Usuario);
        EditText text2 = (EditText)findViewById(R.id.Contrasena);

        Button button = (Button) findViewById(R.id.button10);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String usuario = text.getText().toString();
                Call<UResponse> callvalidacion = MyAPIAdapter.getApiService().IfUsuarioExits(usuario);
                callvalidacion.enqueue(new Callback<UResponse>() {
                    @Override
                    public void onResponse(Call<UResponse> callvalidacion, Response<UResponse> response) {
                        UResponse respuesta = response.body();
                        Boolean validacion = respuesta.getValidacion();
                        if (!validacion){
                            String contrasena = text2.getText().toString();
                            Call<UResponse> call = MyAPIAdapter.getApiService().insertUsuario(usuario, contrasena);
                            call.enqueue(new Callback<UResponse>() {
                                @Override
                                public void onResponse(Call<UResponse> call, Response<UResponse> response) {
                                    UResponse respuesta = response.body();
                                    Boolean validacion = respuesta.getValidacion();
                                    if (validacion){
                                        Toast.makeText(getApplicationContext(), "Se creo correctamente", Toast.LENGTH_SHORT).show();
                                        Call<UResponse> call2 = MyAPIAdapter.getApiService().iniciarSesion(usuario, contrasena);
                                        call2.enqueue(new Callback<UResponse>() {
                                            @Override
                                            public void onResponse(Call<UResponse> call, Response<UResponse> response) {
                                                UResponse respuesta = response.body();
                                                Integer id = respuesta.getIdUsuario();
                                                String User = respuesta.getUsuario();
                                                Toast.makeText(getApplicationContext(), "Inicio Sesion Correctamente", Toast.LENGTH_SHORT).show();
                                                GLOBAL.usuario = User;
                                                GLOBAL.idUsuario = id;
                                                Call<UResponse> callNConf =  MyAPIAdapter.getApiService().obtenerNumeroConfianza(id);
                                                callNConf.enqueue(new Callback<UResponse>() {
                                                    @Override
                                                    public void onResponse(Call<UResponse> call, Response<UResponse> response) {
                                                        UResponse respuesta = response.body();
                                                        String NumeroConf = respuesta.getNumero();
                                                        GLOBAL.NumeroConfianza = NumeroConf;
                                                    }

                                                    @Override
                                                    public void onFailure(Call<UResponse> call, Throwable t) {}
                                                });
                                                Call<UResponse> callPaFav =  MyAPIAdapter.getApiService().obtenerALLPalabraFavorita(id);
                                                callPaFav.enqueue(new Callback<UResponse>() {
                                                    @Override
                                                    public void onResponse(Call<UResponse> call, Response<UResponse> response) {
                                                        if (response.isSuccessful()){
                                                            UResponse respuesta = response.body();
                                                            List<PalabrasFavoritas> palabrasFavoritas = respuesta.getFavoritos();
                                                            for (PalabrasFavoritas PFav: palabrasFavoritas){
                                                                GLOBAL.PalabrasFavoritas.add(new PalabrasFavoritas(PFav.getKeyWord(), PFav.getFrase(), PFav.getOrden()));
                                                            }
                                                        }
                                                    }

                                                    @Override
                                                    public void onFailure(Call<UResponse> call, Throwable t) {}
                                                });
                                                Intent intent = new Intent(LogIn.this, MainActivity.class);
                                                startActivity(intent);
                                            }

                                            @Override
                                            public void onFailure(Call<UResponse> call, Throwable t) {
                                                Toast.makeText(getApplicationContext(), "Error en Inicio Sesion", Toast.LENGTH_SHORT).show();
                                            }
                                        });
                                    }
                                }

                                @Override
                                public void onFailure(Call<UResponse> call, Throwable t) {}
                            });
                        }else{
                            Toast.makeText(getApplicationContext(), "Error nombre de usuario ya existe", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<UResponse> call, Throwable t) {
                    }
                });
            }
        });
        Button LogIn = (Button) findViewById(R.id.button9);
        LogIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String usuario = text.getText().toString();
                String contrasena = text2.getText().toString();
                Call<UResponse> call = MyAPIAdapter.getApiService().iniciarSesion(usuario, contrasena);
                call.enqueue(new Callback<UResponse>() {
                    @Override
                    public void onResponse(Call<UResponse> call, Response<UResponse> response) {
                        UResponse respuesta = response.body();
                        Integer id = respuesta.getIdUsuario();
                        String User = respuesta.getUsuario();
                        Toast.makeText(getApplicationContext(), "Inicio Sesion Correctamente", Toast.LENGTH_SHORT).show();
                        GLOBAL.usuario = User;
                        GLOBAL.idUsuario = id;
                        Call<UResponse> callNConf =  MyAPIAdapter.getApiService().obtenerNumeroConfianza(id);
                        callNConf.enqueue(new Callback<UResponse>() {
                            @Override
                            public void onResponse(Call<UResponse> call, Response<UResponse> response) {
                                UResponse respuesta = response.body();
                                String NumeroConf = respuesta.getNumero();
                                GLOBAL.NumeroConfianza = NumeroConf;
                            }

                            @Override
                            public void onFailure(Call<UResponse> call, Throwable t) {}
                        });
                        Call<UResponse> callPaFav =  MyAPIAdapter.getApiService().obtenerALLPalabraFavorita(id);
                        callPaFav.enqueue(new Callback<UResponse>() {
                            @Override
                            public void onResponse(Call<UResponse> call, Response<UResponse> response) {
                                if (response.isSuccessful()){
                                    UResponse respuesta = response.body();
                                    List<PalabrasFavoritas> palabrasFavoritas = respuesta.getFavoritos();
                                    for (PalabrasFavoritas PFav: palabrasFavoritas){
                                        GLOBAL.PalabrasFavoritas.add(new PalabrasFavoritas(PFav.getKeyWord(), PFav.getFrase(), PFav.getOrden()));
                                    }
                                }
                            }

                            @Override
                            public void onFailure(Call<UResponse> call, Throwable t) {}
                        });
                        generateNoteOnSD(LogIn.this, "UserInfo.utp", usuario + "-" + contrasena);
                        Intent intent = new Intent(LogIn.this, MainActivity.class);
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(intent);
                            }
                        }, 2000);
                    }
                    @Override
                    public void onFailure(Call<UResponse> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), "Error en Inicio Sesion", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
    public void generateNoteOnSD(Context context, String sFileName, String sBody) {
        try {
            File root = new File(Environment.getExternalStorageDirectory(), "Android/data/dio.kjasd.ddam/files/");
            if (!root.exists()) {
                root.mkdirs();
            }
            File gpxfile = new File(root, sFileName);
            FileWriter writer = new FileWriter(gpxfile);
            writer.append(sBody);
            writer.flush();
            writer.close();
            Toast.makeText(context, "Saved", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
