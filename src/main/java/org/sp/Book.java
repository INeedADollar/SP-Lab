package org.sp;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private final String title;
    private Author author;
    private List<Chapter> chapters = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public int createChapter(String name) {
        Chapter ch = new Chapter(name);
        chapters.add(ch);
        return chapters.size();
    }

    public Chapter getChapter(int chapterIndex) {
        return chapters.get(chapterIndex - 1);
    }

    public void print(){
        System.out.println(title);
        author.print();
    }
}
