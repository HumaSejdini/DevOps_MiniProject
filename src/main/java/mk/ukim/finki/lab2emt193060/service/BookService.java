package mk.ukim.finki.lab2emt193060.service;

import mk.ukim.finki.lab2emt193060.model.Book;
import mk.ukim.finki.lab2emt193060.model.dto.BookDto;
import mk.ukim.finki.lab2emt193060.model.Category;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();
    Optional<Book> findById(Long id);
    Optional<Book> save(String name, Long category, Long authorId, Integer availableCopies);
    Optional<Book> edit(Long id,String name, Long category, Long authorId, Integer availableCopies);
    void deleteById(Long id);
    Book markAsTaken(Long id);

    Optional<Book> save(BookDto bookDto);

    Optional<Book> edit(Long id, BookDto bookDto);
}
