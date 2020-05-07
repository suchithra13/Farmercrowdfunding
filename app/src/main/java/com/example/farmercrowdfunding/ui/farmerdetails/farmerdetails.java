package com.example.farmercrowdfunding.ui.farmerdetails;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.farmercrowdfunding.R;

public class farmerdetails extends Fragment {

    private FarmerdetailsViewModel mViewModel;

    public static farmerdetails newInstance() {
        return new farmerdetails();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.farmerdetails_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FarmerdetailsViewModel.class);
        // TODO: Use the ViewModel
    }

}
