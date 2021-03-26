package com.example.ayomikunanjorinsapp.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Population can be defined as the total number of inhabitants in a place."
        +"\nThis graph shows the total Population of Nigeria in the year 2014 divided according to their genders and respective age groups."
                +"\nAccording to this data, as of 2014, its population was 176,404,931 people showing that Nigeria is an overpopulated country."
        );
    }

    public LiveData<String> getText() {
        return mText;
    }
}