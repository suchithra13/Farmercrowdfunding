package com.example.farmercrowdfunding.ui.insurance;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.farmercrowdfunding.R;

public class insurance extends Fragment implements View.OnClickListener {

    public static insurance newInstance() {
        return new insurance();
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.insurance_fragment, container, false);

        final EditText txt_number = (EditText) v.findViewById(R.id.phone1);
        final EditText txt_province = (EditText) v.findViewById(R.id.crop);
        final EditText txt_write = (EditText) v.findViewById(R.id.acre);
        final Button txt_show1 = (Button) v.findViewById(R.id.submit2);

        txt_show1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Onclick","Onclick");

                txt_show1.setVisibility(View.INVISIBLE);
                txt_number.setVisibility(View.VISIBLE);
                txt_province.setVisibility(View.VISIBLE);
                txt_write.setVisibility(View.VISIBLE);
            }

        });
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // TODO: Use the ViewModel
    }

    @Override
    public void onClick(View v) {

    }
}
