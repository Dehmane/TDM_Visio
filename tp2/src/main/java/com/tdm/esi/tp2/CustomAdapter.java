package com.tdm.esi.tp2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 09/03/2016.
 */
public class CustomAdapter extends BaseAdapter {
    private List<Book> booklist;
    private Context context;

    public CustomAdapter(List<Book> booklist, Context context) {
        this.booklist = booklist;
        this.context = context;
    }


    @Override
    public int getCount() {
        return booklist.size();
    }

    @Override
    public Object getItem(int position) {
        return booklist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = parent.inflate(context,R.layout.list_item,null);
        TextView t1 = (TextView) convertView.findViewById(R.id.title);
        TextView t2 = (TextView) convertView.findViewById(R.id.authors);
        TextView t3 = (TextView) convertView.findViewById(R.id.edition);
        ImageView img = (ImageView) convertView.findViewById(R.id.imageView);
        t1.setText(booklist.get(position).getTitle());
        List<String> bookAuthors = booklist.get(position).getAuthor();
        String authors = bookAuthors.get(0);
        int listSize = bookAuthors.size();
        if (listSize > 1) {
            for (int i = 1; i < listSize; i++) {
                authors = authors + ", " + bookAuthors.get(i);
            }
            t2.setText("Auteur(s): "+ authors);
        }
        t3.setText("Editeur: " + booklist.get(position).getEdition());
        img.setImageResource(booklist.get(position).getIconCover());
        return convertView;
    }
}
