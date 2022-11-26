package dio.kjasd.ddam.ui.hablemos;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import dio.kjasd.ddam.GLOBAL;
import dio.kjasd.ddam.PalabrasFavoritas;
import dio.kjasd.ddam.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FavoritosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FavoritosFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    Map<Integer, String> map = new HashMap<Integer, String>();
    TextToSpeech mTTS;
    private AppCompatActivity mClass;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FavoritosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FavoritosFragment.
     */

    // TODO: Rename and change types and number of parameters
    public static FavoritosFragment newInstance(String param1, String param2) {
        FavoritosFragment fragment = new FavoritosFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_favoritos, container, false);
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        if(GLOBAL.PalabrasFavoritas.size() != 0){
            Integer[] id = {R.id.Slot1, R.id.Slot2, R.id.Slot3, R.id.Slot4,
                    R.id.Slot5, R.id.Slot6, R.id.Slot7, R.id.Slot8};
            Integer cont = 0;
            for(PalabrasFavoritas pfav:GLOBAL.PalabrasFavoritas){
                Button slot = (Button) view.findViewById(id[cont]);
                slot.setText(pfav.getKeyWord());
                map.put(id[cont], pfav.getFrase());
                Button btn = (Button) view.findViewById(id[cont]);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ButtonClicked(v);
                    }
                });
                cont++;

            }
        }
        return view;
    }

    public void ButtonClicked(View view) {
        mTTS = new TextToSpeech(getActivity(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    Locale locSpanish = new Locale("spa", "PE");
                    mTTS.setLanguage(locSpanish);
                    mTTS.speak(map.get(view.getId()), TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
}