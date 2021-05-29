package dao;

import models.rent.Room;
import util.FileDao;

import java.util.List;

public abstract class ServiceDao<T> {
    protected final FileDao<T> fileDao;

    protected ServiceDao(String filePath, Class<T> tClass) {
        this.fileDao = new FileDao<>(filePath, tClass);
    }

    abstract protected List<String> showAllNameNotDuplicate();

    abstract protected T addNewServices(T t);

    abstract protected List<T> showServices();

}
