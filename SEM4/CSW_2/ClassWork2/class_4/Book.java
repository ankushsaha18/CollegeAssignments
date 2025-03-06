package com.Ankush;

import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return id + " " + title + " " + author;
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null){
            return false;
        }
        if(this.getClass() != o.getClass()){
            return false;
        }
        Book b2 = (Book) o;
        if(this.id== b2.getId() && this.title.equals(b2.getTitle())  && this.author.equals(b2.getAuthor())){
            return true;
        }
        return false;
    }
}
