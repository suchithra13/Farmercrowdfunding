package com.example.farmercrowdfunding.ui.farmerdetails;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class FarmerdetailsViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FarmerdetailsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
   }
