package com.tdm.esi.tp2;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {
    CustomAdapter customAdapter;
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment,null);
        listView = (ListView) view.findViewById(R.id.listView);
        customAdapter = new CustomAdapter(getBookList(),null);
        listView.setAdapter(customAdapter);
        List<Book> bookList = new ArrayList<>();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               /* Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("book", (Book) customAdapter.getItem(position));
                startActivity(intent);*/

            }
        });
        return view;
    }

    public List<Book> getBookList() {
        String[] listSummary = getResources().getStringArray(R.array.summary);
        List<Book> bookList = new ArrayList<Book>();
        // le 1er livre
        Book book = new Book();
        book.setTitle("Design Patterns in Java");
        List authors = new ArrayList();
        authors.add("Steven John Metsker");
        authors.add("William C. Wake");
        book.setAuthor(authors);
        book.setEdition("Addison-Wesley Professional");
        book.setIconCover(R.drawable.ic_dpjava);
        book.setCover(R.drawable.ic_dpjavacover);
        book.setYear("2006");
        book.setDescription(listSummary[0]);
        bookList.add(book);
        // le 2eme livre
        book = new Book();
        //book.setTitle("UML 2.0 in a Nutshell");
        book.setTitle("UML 2.0 in a Nutshell UML 2.0");
        authors = new ArrayList();
        authors.add("Dan Pilone");
        authors.add("Neil Pitman");
        book.setAuthor(authors);
        book.setEdition("O\'Reilly");
        book.setIconCover(R.drawable.ic_uml_2);
        book.setCover(R.drawable.ic_uml_2cover);
        book.setYear("2005");
        book.setDescription(listSummary[1]);
        bookList.add(book);
        // le 3eme livre
        book = new Book();
        book.setTitle("Microsoft SQL Server 2012 Pocket Consultant");
        authors = new ArrayList();
        authors.add("William R. Stanek");
        book.setAuthor(authors);
        book.setEdition("Microsoft Press");
        book.setIconCover(R.drawable.ic_sqlpc);
        book.setCover(R.drawable.ic_sqlpc_cover);
        book.setYear("2012");
        book.setDescription(listSummary[2]);
        bookList.add(book);
        // le 4ème livre
        book = new Book();
        book.setTitle("Android UI Fundamentals: Develop & Design");
        authors = new ArrayList();
        authors.add("Jason Ostrander");
        book.setAuthor(authors);
        book.setEdition("Peachpit Press");
        book.setIconCover(R.drawable.ic_androidfd);
        book.setCover(R.drawable.ic_androidfdcover);
        book.setYear("2012");
        book.setDescription(listSummary[3]);
        bookList.add(book);
        // le 5ème livre
        book = new Book();
        book.setTitle("Programming in Objective-C");
        authors = new ArrayList();
        authors.add("Stephen Kochan");
        book.setAuthor(authors);
        book.setEdition("Developer's Library");
        book.setIconCover(R.drawable.ic_objectivec);
        book.setCover(R.drawable.ic_objectivecover);
        book.setYear("2012");
        book.setDescription(listSummary[4]);
        bookList.add(book);
        // le 6 ème livre
        book = new Book();
        book.setTitle("Learning Agile");
        authors = new ArrayList();
        authors.add("Andrew Stellman");
        authors.add("Jennifer Greene");
        book.setAuthor(authors);
        book.setEdition("Kindle Edition");
        book.setIconCover(R.drawable.ic_agile);
        book.setCover(R.drawable.ic_agilecovrer);
        book.setYear("2014");
        book.setDescription(listSummary[5]);
        bookList.add(book);
        // le 7 ème livre
        book = new Book();
        book.setTitle("Learning the UNIX Operating System");
        authors = new ArrayList();
        authors.add("Jerry Peek");
        authors.add("Grace T-Gonguet");
        authors.add("John Strang");
        book.setAuthor(authors);
        book.setEdition("O'Reilly Media, Inc.");
        book.setIconCover(R.drawable.ic_unixicon);
        book.setCover(R.drawable.ic_unixicover);
        book.setYear("2002");
        book.setDescription(listSummary[6]);
        bookList.add(book);
        return bookList;

    }
}
