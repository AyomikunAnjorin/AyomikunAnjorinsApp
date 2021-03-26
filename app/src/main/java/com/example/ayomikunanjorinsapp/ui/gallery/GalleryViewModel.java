package com.example.ayomikunanjorinsapp.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("The figure below represents the 2014 population statistics.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}