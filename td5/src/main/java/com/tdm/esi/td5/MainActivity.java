package com.tdm.esi.td5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Button btn = (Button) findViewById(R.id.button);

    }

    public void go(View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
