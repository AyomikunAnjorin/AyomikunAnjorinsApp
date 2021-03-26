package com.example.ayomikunanjorinsapp.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Ayomikun Anjorin.\n17CJ022476");
    }

    public LiveData<String> getText() {
        return mText;
    }
}