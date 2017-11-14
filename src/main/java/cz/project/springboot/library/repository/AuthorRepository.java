package cz.project.springboot.library.repository;

import cz.project.springboot.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
//    List<Author> findByFioContainingOrderByFio(String fio);
//
//    List<Author> findByFioContainingIgnoreCaseOrderByFio(String fio);


    @Query(value="select a from Author a where a.fio like %?1", nativeQuery = true)
    List<Author> findByFioEndsWith(String fio);
//    List<Author> findByFioOrOrderByFioAsc(String fio);
}
