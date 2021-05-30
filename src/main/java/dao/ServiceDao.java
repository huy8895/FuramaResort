package dao;

import util.AbstractDao;
import util.FileCSVDao;

import java.util.List;

public abstract class ServiceDao<T> {
    protected final AbstractDao<T> fileCSVDao;

    protected ServiceDao(String filePath, Class<T> tClass) {
        this.fileCSVDao = new FileCSVDao<>(filePath, tClass);
    }

    abstract protected List<String> showAllNameNotDuplicate();

    abstract protected T addNewService(T t);

    abstract protected List<T> showServices();

}
