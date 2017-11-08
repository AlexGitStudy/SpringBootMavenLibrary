package cz.project.springboot.library.dao;

import cz.project.springboot.library.model.Book;

import java.util.List;

public interface BookDao extends GeneralDao<Book> {

    List<Book> findTopBook(int limit);

}
