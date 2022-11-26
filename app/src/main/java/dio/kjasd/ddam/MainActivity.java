package dio.kjasd.ddam;

import static java.util.Objects.isNull;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import dio.kjasd.ddam.databinding.ActivityMainBinding;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    private String userGlobal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String usuario = "";
        String contrasena = "";

        File sdcard = Environment.getExternalStorageDirectory();

        File file = new File(sdcard,"Android/data/dio.kjasd.ddam/files/UserInfo.utp");

        StringBuilder text = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                text.append(line);
            }
            br.close();
            String[] aux =  text.toString().split("-");
            usuario = aux[0];
            contrasena = aux[1];
        }
        catch (IOException e) {

        }




        if(usuario != "" && contrasena != "" && isNull(GLOBAL.idUsuario)){
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
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
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







        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TextView user = (TextView)findViewById(R.id.txtnombre);
        user.setText(GLOBAL.usuario == null ? "USUARIO":GLOBAL.usuario);

        setSupportActionBar(binding.appBarMain.toolbar);

        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Llamando a número de confianza..", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+51 "+(GLOBAL.NumeroConfianza == null ? "":GLOBAL.NumeroConfianza)));
                startActivity(intent);
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_hablemos, R.id.nav_picto)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        NavigationView navigationView2 = (NavigationView) findViewById(R.id.nav_view);
        View headerView = navigationView2.getHeaderView(0);
        TextView navUsername = (TextView) headerView.findViewById(R.id.nombreUsuario);
        navUsername.setText(GLOBAL.usuario == null ? "USUARIO":GLOBAL.usuario);
        userGlobal = navUsername.getText().toString();
        TextView navUsername2 = (TextView) headerView.findViewById(R.id.numero);
        navUsername2.setText(GLOBAL.NumeroConfianza == null ? "  No Existe Numero\n  de Confianza":GLOBAL.NumeroConfianza);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();

    }

    public void callLogIn(View view) {
        if(userGlobal == "USUARIO"){
            Intent intent = new Intent(MainActivity.this, LogIn.class);
            startActivity(intent);
        }else{
            AlertDialog.Builder adb = new AlertDialog.Builder(this);
            adb.setTitle("¿Desea Cerrar Sesion?");
            adb.setIcon(android.R.drawable.ic_dialog_alert);
            adb.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    File sdcard = Environment.getExternalStorageDirectory();
                    File file = new File(sdcard, "UserInfo.utp");
                    boolean deleted = file.delete();
                    if (deleted){
                        GLOBAL.NumeroConfianza = null;
                        GLOBAL.idUsuario = null;
                        GLOBAL.usuario = null;
                        GLOBAL.PalabrasFavoritas.clear();
                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(intent);
                            }
                        }, 2000);
                        Toast.makeText(getApplicationContext(), "Sesion Iniciada", Toast.LENGTH_SHORT).show();
                    }

                }
            });
            adb.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            adb.show();
//
        }

    }

}