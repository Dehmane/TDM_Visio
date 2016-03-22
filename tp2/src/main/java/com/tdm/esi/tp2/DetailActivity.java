package com.tdm.esi.tp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        Book book = (Book) intent.getSerializableExtra("book");
        TextView t1 = (TextView) findViewById(R.id.titleDetail);
        ImageView img2 = (ImageView) findViewById(R.id.imageView2);
        TextView t2 = (TextView) findViewById(R.id.authorsDetail);
        TextView t3 = (TextView) findViewById(R.id.year);
        TextView t4 = (TextView) findViewById(R.id.editionDetail);
        TextView t5 = (TextView) findViewById(R.id.summary);
        if (book!=null) {
            t1.setText("Titre:" + book.getTitle());
            img2.setImageResource(book.getCover());
            t2.setText("Auteur(s):" + book.getAuthor().get(0));
            if (book.getAuthor().size() > 1) {
                //textAuthorLabel.setText("Auteurs: ");
                for (int i = 1; i < book.getAuthor().size(); i++) {
                    t2.setText(t2.getText() + ", " + book.getAuthor().get(i));
                }
            }
            t3.setText("Année:" + book.getYear());
            t4.setText("Editeur:" + book.getEdition());
            t5.setText("Résumé:" + book.getDescription());
        }
    }



}
