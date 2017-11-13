package cz.project.springboot.library.repository;

import cz.project.springboot.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    List<Book> findByNameContainingOrderByName(String name);
    List<Book> findByNameContainingOrAuthorFioContainingOrderByName(String name, String fio);

}
