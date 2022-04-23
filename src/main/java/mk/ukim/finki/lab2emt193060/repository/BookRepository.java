package mk.ukim.finki.lab2emt193060.repository;

import mk.ukim.finki.lab2emt193060.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    void deleteByName(String name);
}
