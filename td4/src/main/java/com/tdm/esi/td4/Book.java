package com.tdm.esi.td4;

import java.io.Serializable;

/**
 * Created by Administrator on 02/03/2016.
 */
public class Book implements Serializable {
    private String title;
    private String author;

    public Book()
    {

    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
