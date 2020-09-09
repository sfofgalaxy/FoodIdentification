package com.example.myapplication.ui.plate;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PlateViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PlateViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is nfc fragment");
    }

}