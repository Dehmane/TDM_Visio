package com.tdm.esi.td2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String text = String.format(getString(R.string.txtview2str),"Chakib",3);
        TextView textView = (TextView)findViewById(R.id.txtview2);
        textView.setText(text);
        /*String text1 = String.format(getString(R.string.txtview2str),"Chakib",3);
        TextView textView = (TextView)findViewById(R.id.txtview2);
        textView.setText(text);*/
    }
}
