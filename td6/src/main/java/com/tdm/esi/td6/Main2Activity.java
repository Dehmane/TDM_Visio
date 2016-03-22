package com.tdm.esi.td6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setFinishOnTouchOutside(false);
    }

    public void fermer(View v)
    {
        finish();
    }
}

