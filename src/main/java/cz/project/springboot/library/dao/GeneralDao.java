package cz.project.springboot.library.dao;

import java.util.List;

public interface GeneralDao<T> {

    List<T> getAll();

    T get(long id);

    T save(T obj);

    void del(T obj);

    List<T> search(String... searchString);
}
