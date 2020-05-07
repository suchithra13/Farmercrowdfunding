package com.example.farmercrowdfunding.ui.insurance;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;


import com.example.farmercrowdfunding.R;

public class InsuranceViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public InsuranceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");

    }

    public LiveData<String> getText() {
        return mText;
    }
}
