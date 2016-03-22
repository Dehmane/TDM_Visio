package com.tdm.esi.td3_tp;

/**
 * Created by Administrator on 24/02/2016.
 */
public class Book {
    private int cover;
    private String title;

    public Book(String title, int cover) {
        this.cover = cover;
        this.title = title;
    }

    public int getCover() {
        return cover;
    }

    public String getTitle() {
        return title;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

