package dao;

import java.util.List;

public abstract class ServiceDao<T> implements AbstractDao<T>{
    abstract protected List<T> showAllNameNotDuplicate();
}
