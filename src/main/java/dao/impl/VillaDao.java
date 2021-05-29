package dao.impl;

import dao.ServiceDao;
import models.rent.Villa;

import java.util.List;
import java.util.stream.Collectors;

public class VillaDao extends ServiceDao<Villa> {
    private static final String VILLA_CSV = "src/main/java/data/Villa.csv";

    protected VillaDao() {
        super(VILLA_CSV, Villa.class);
    }

    @Override
    public List<String> showAllNameNotDuplicate() {
        return fileDao.showList()
                      .stream()
                      .map(villa -> villa.getName())
                      .distinct()
                      .collect(Collectors.toList());
    }

    @Override
    public Villa addNewServices(Villa t) {
        return fileDao.save(t);
    }

    @Override
    public List<Villa> showServices() {
        return fileDao.showList();
    }
}
