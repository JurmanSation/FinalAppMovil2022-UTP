package dio.kjasd.ddam.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import dio.kjasd.ddam.databinding.FragmentHomeBinding;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    FragmentHomeBinding binding;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bienvenido!");
    }




    public LiveData<String> getText() {
        return mText;
    }
}

