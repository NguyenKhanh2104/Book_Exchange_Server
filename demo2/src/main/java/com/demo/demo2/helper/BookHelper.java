package com.demo.demo2.helper;

import com.demo.demo2.models.Book;
import com.demo.demo2.security.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BookHelper {

    private final BookService bookService;

    public ResponseEntity<Book> getById(Integer id) {
        Book book = bookService.getById(id);
        if (book != null) {
            return ResponseEntity.ok(book);
        }
        return null;
    }
    public ResponseEntity<List<Book>> getAllBook() {
        List<Book> book = bookService.findAllBook();
        if (book != null) {
            System.out.println(true);
            return ResponseEntity.ok(book);
        }
      return null;
    }
    public ResponseEntity<?> addBook(Book book) {
         Book newBook = bookService.addBook(book);
        if (newBook != null) {
            return ResponseEntity.ok(newBook);
        }
        return ResponseEntity.badRequest().body("Could not add : "+book);
    }
    public ResponseEntity<?> updateBook(Book book) {
        Book newBook = bookService.updateBook(book);
        if (newBook != null) {
            return ResponseEntity.ok(newBook);
        }
        return ResponseEntity.badRequest().body("Could not update: "+book);
    }
}
