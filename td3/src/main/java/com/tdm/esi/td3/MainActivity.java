package com.tdm.esi.td3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView a = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ListView l = (ListView) findViewById(R.id.listView);
        String[] tab = {"Alger la blanche", "Oran el bahia", "Medea Titri", "Blida la ville des roses", "Timimoune l'oasis rouge"};
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,tab);
        a.setAdapter(arrayAdapter);
        a.setThreshold(1);
        l.setAdapter(arrayAdapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = arrayAdapter.getItem(position).toString();
                Toast.makeText(getApplicationContext(),"Bonjour "+text+" !",Toast.LENGTH_SHORT).show();
            }
        });


    }

    /*public void afficher(View v)
    {
       if(v.getId() == R.id.button) {
           Toast.makeText(this,"Bonjour !",Toast.LENGTH_SHORT).show();
       }
        if(v.getId() == R.id.checkBox)
        {
            afficher2(v);
        }
    }

    public void afficher2(View v)
    {
        CheckBox c = (CheckBox) v;
        if (c.isChecked())
        Toast.makeText(this,"Is Checked Man !",Toast.LENGTH_SHORT).show();
        else Toast.makeText(this,"Check it please !",Toast.LENGTH_SHORT).show();
    }*/
}
