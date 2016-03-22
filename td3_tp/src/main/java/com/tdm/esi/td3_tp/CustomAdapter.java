package com.tdm.esi.td3_tp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 24/02/2016.
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
        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        textView.setText(booklist.get(position).getTitle());
        imageView.setImageResource(booklist.get(position).getCover());
        return convertView;
    }
}
