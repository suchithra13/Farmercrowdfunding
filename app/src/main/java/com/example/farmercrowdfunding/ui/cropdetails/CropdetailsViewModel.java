package com.example.farmercrowdfunding.ui.cropdetails;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class CropdetailsViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public CropdetailsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
  }
