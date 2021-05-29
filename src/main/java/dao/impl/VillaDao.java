package dao.impl;

import dao.AbstractDao;
import dao.ServiceDao;
import models.rent.Villa;

import java.util.List;

public class VillaDao extends ServiceDao<Villa> {
    @Override
    public Villa add(Villa villa) {
        return null;
    }

    @Override
    public Villa getDetail(String id) {
        return null;
    }

    @Override
    public List<Villa> showList() {
        return null;
    }

    @Override
    public Villa update(Villa villa) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    protected List<Villa> showAllNameNotDuplicate() {
        return null;
    }
}
