package org.sp.difexamples;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.sp.models.Author;
import org.sp.models.Book;
import org.sp.models.Element;
import org.sp.models.NewBookRequest;
import org.sp.persistence.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class BooksController {
    private final BooksRepository booksRepository;
    private final BooksSubject allBooksSubject;

    @PostMapping
    public String newBook(@RequestBody NewBookRequest newBookRequest) {
        Book book = createBook(newBookRequest);
        book = booksRepository.save(book);
        allBooksSubject.add(book);
        return "Book saved [" + book.getId() + "] " + book.getTitle();
    }

    private Book createBook(NewBookRequest newBookRequest) {
        Book book = new Book(newBookRequest.title);

        for(Author author : newBookRequest.authors) {
            book.addAuthor(author);
        }

        return book;
    }

    @SneakyThrows
    @GetMapping("/books/{id}")
    private ResponseEntity<Element> getBook(@PathVariable Integer id) {
        Book b = booksRepository.getOne(id);
        return new ResponseEntity<>(b, HttpStatus.OK);
    }
}
