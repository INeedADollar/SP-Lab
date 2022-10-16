package org.sp;

public class Book {
    private final String title;
    private Author author;
    private final TableOfContents tableOfContents = new TableOfContents();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public int createChapter(String name) {
        return tableOfContents.addChapter(name);
    }

    public Chapter getChapter(int chapterIndex) {
        return tableOfContents.getChapter(chapterIndex);
    }

    public void print(){
        System.out.println(title);
        author.print();
        tableOfContents.print();
    }
}
