package com.example.farmercrowdfunding.ui.insurance;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.farmercrowdfunding.Main4Activity;
import com.example.farmercrowdfunding.R;

public class Insuranceadpt extends FragmentActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insurance_fragment);
        button = (Button) findViewById(R.id.submit2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.submit2) {
                    openActivity2("Successfully submitted");
                }
            }
        });
    }
    public void openActivity2(String message) {
        Intent intent=new Intent(this, Main4Activity.class);
        startActivity(intent);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

}
