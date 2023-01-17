package org.sp.difexamples;

import org.sp.models.Book;
import org.sp.models.Observer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BooksSubject {
    List<Observer> observerList = new ArrayList<>();
    List<Book> books = new ArrayList<>();

    public void add(Book book) {
        book.add(book);
        notifyObservers(book);
    }
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers(Book book) {
        for(Observer observer : observerList) {
            observer.update(book);
        }
    }
}
