package dio.kjasd.ddam.ui.pictogramas;

import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import dio.kjasd.ddam.MisNecesidades;
import dio.kjasd.ddam.R;
import dio.kjasd.ddam.Settings;
import dio.kjasd.ddam.SientoCon;
import dio.kjasd.ddam.YoNecesito;
import dio.kjasd.ddam.YoQuiero;
import dio.kjasd.ddam.YoVoy;
import dio.kjasd.ddam.Yomesiento;

public class PictogramasFragment extends Fragment {
Activity context;
    private PictogramasViewModel mViewModel;

    public static PictogramasFragment newInstance() {
        return new PictogramasFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        context= getActivity();
        return inflater.inflate(R.layout.fragment_pictogramas, container, false);


    }

    public void onStart(){
        super.onStart();
        Button btn1 = (Button) context.findViewById(R.id.quierohome);
        Button btn2 = (Button) context.findViewById(R.id.sientohome);
        Button btn3=(Button) context.findViewById(R.id.sientoconhome);
        Button btn4=(Button) context.findViewById(R.id.yovoyhome);
        Button btn5=(Button) context.findViewById(R.id.necesitohome);
        Button btn6=(Button) context.findViewById(R.id.necesihome);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,YoQuiero.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Yomesiento.class);
                startActivity(intent);
            }
        });

        //sientoconhome
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SientoCon.class);
                startActivity(intent);
            }
        });

        //yovoyhome
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, YoVoy.class);
                startActivity(intent);
            }
        });
        //necesitohome
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MisNecesidades.class);
                startActivity(intent);
            }
        });

        //necesihome
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, YoNecesito.class);
                startActivity(intent);
            }
        });





    }





    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PictogramasViewModel.class);
        // TODO: Use the ViewModel


    }





}