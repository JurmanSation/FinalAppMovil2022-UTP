package dio.kjasd.ddam.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import dio.kjasd.ddam.Ayuda;
import dio.kjasd.ddam.R;
import dio.kjasd.ddam.Settings;
import dio.kjasd.ddam.databinding.FragmentHomeBinding;
import dio.kjasd.ddam.ui.hablemos.HablemosFragment;
import dio.kjasd.ddam.ui.pictogramas.PictogramasFragment;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;*/

        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }


//fragment to fragment Hablemos
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        binding.Hablemosboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment hablemosFragment = new HablemosFragment();
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment_content_main,hablemosFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
//Fragment to Fragment Pictogramas
        binding.Pictogramaboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment pictogramasFragment = new PictogramasFragment();
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment_content_main,pictogramasFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        //Ayuda
        Button Ayudaboton= (Button) view.findViewById(R.id.Ayudaboton);
        Ayudaboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), Ayuda.class);
                in.putExtra("some", "some data");
                startActivity(in);
            }
        });

        //Configuracion
        Button Configboton= (Button) view.findViewById(R.id.Configboton);
        Configboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), Settings.class);
                startActivity(in);
            }
        });

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}