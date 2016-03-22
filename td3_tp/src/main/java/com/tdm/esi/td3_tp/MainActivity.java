package com.tdm.esi.td3_tp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listView);
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("SQL Server 2012",R.drawable.ic_sqlpc);
        bookList.add(book);
        Book book2 = new Book("Da Vinci Code",R.drawable.ic_davincicode);
        bookList.add(book2);
        CustomAdapter customAdapter = new CustomAdapter(bookList,this);
        listView.setAdapter(customAdapter);
    }
}
