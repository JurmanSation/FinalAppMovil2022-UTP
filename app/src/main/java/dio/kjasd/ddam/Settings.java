package dio.kjasd.ddam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Settings extends AppCompatActivity {
    private SeekBar mSeekBarVel;
    private SeekBar mSeekBarTon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        TextView user = (TextView)findViewById(R.id.Username);
        user.setText(GLOBAL.usuario == null ? "USUARIO":GLOBAL.usuario);

        EditText numeroConfianza = (EditText)findViewById(R.id.NConfianza);
        numeroConfianza.setText(GLOBAL.NumeroConfianza == null ? "":GLOBAL.NumeroConfianza);

        Button button = (Button) findViewById(R.id.btnGuardar);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String nconfianza = numeroConfianza.getText().toString();
                if(Objects.isNull(GLOBAL.NumeroConfianza)) {
                    Call<UResponse> call = MyAPIAdapter.getApiService().insertarNumeroConfianza(GLOBAL.idUsuario, nconfianza);
                    call.enqueue(new Callback<UResponse>() {
                        @Override
                        public void onResponse(Call<UResponse> call, Response<UResponse> response) {
                            UResponse respuesta = response.body();
                            Boolean validacion = respuesta.getValidacion();
                            if (validacion){
                                Toast.makeText(getApplicationContext(), "Numero Registrado Correctamente", Toast.LENGTH_SHORT).show();
                                GLOBAL.NumeroConfianza = nconfianza;
                                Intent intent = new Intent(Settings.this, MainActivity.class);
                                startActivity(intent);
                            }
                        }

                        @Override
                        public void onFailure(Call<UResponse> call, Throwable t) {
                            Toast.makeText(getApplicationContext(), "Hubo un error al registrar el numero, intente mas tarde", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                else
                {
                    Call<UResponse> call = MyAPIAdapter.getApiService().editNumeroConfianza(nconfianza, GLOBAL.idUsuario);
                    call.enqueue(new Callback<UResponse>() {
                        @Override
                        public void onResponse(Call<UResponse> call, Response<UResponse> response) {
                            UResponse respuesta = response.body();
                            Boolean validacion = respuesta.getValidacion();
                            if (validacion){
                                Toast.makeText(getApplicationContext(), "Numero Actualizado Correctamente", Toast.LENGTH_SHORT).show();
                                GLOBAL.NumeroConfianza = nconfianza;
                                Intent intent = new Intent(Settings.this, MainActivity.class);
                                startActivity(intent);
                            }
                        }

                        @Override
                        public void onFailure(Call<UResponse> call, Throwable t) {
                            Toast.makeText(getApplicationContext(), "Hubo un error al actualizar el numero, intente mas tarde", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });
    }




}