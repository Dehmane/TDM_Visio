package com.tdm.esi.tp2;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 09/03/2016.
 */
public class Book implements Serializable {

    private String title;
    private List<String> author;
    private String edition;
    private String year;
    private int cover;
    private int iconCover;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public int getIconCover() {
        return iconCover;
    }

    public void setIconCover(int iconCover) {
        this.iconCover = iconCover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
