package com.tdm.esi.td4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        //String text = intent.getStringExtra("message");
        Book book = (Book) intent.getSerializableExtra("book");
        TextView tex = (TextView) findViewById(R.id.textView);
        tex.setText(book.getTitle());
    }
}
