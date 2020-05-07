package com.example.farmercrowdfunding.ui.scheme;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class SchemeViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public SchemeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
