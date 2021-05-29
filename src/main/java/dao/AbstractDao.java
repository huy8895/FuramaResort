package dao;

import java.util.List;

public interface AbstractDao<T> {
    T add(T t);

    T getDetail(String id);

    List<T> showList();

    T update(T t);

    void delete(String id);
}
