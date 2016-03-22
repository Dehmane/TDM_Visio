package com.tdm.esi.tp2;

import android.app.Fragment;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_fragment, null);
        Bundle bundle = getArguments();
        if (bundle!=null) {

            Book book = (Book) bundle.getSerializable("book");
            TextView t1 = (TextView) view.findViewById(R.id.titleDetail);
            ImageView img2 = (ImageView) view.findViewById(R.id.imageView2);
            TextView t2 = (TextView) view.findViewById(R.id.authorsDetail);
            TextView t3 = (TextView) view.findViewById(R.id.year);
            TextView t4 = (TextView) view.findViewById(R.id.editionDetail);
            TextView t5 = (TextView) view.findViewById(R.id.summary);
            if (book != null) {
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
        return view;
    }


}
