package com.tdm.esi.td4;

import android.content.Intent;
import android.net.Uri;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPage(View v)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        //intent.setData(Uri.parse("tel:002135587"));
        //intent.setPackage("com.android.phone");
        /*intent.putExtra(AlarmClock.EXTRA_MESSAGE,"Wake up !");
        intent.putExtra(AlarmClock.EXTRA_HOUR,5);
        intent.putExtra(AlarmClock.EXTRA_MINUTES,45);*/
        Book book = new Book();
        book.setTitle("Mein Kampf");
        book.setAuthor("Adolf Hitler");
        intent.putExtra("book",book);
        startActivity(intent);
    }
}
