package dao.impl;

import dao.ServiceDao;
import models.rent.House;

import java.util.List;
import java.util.stream.Collectors;

public class HouseDao extends ServiceDao<House> {
    private static final String DATA_HOUSE_CSV = "src/main/java/data/House.csv";

    public HouseDao() {
        super(DATA_HOUSE_CSV, House.class);
    }

    @Override
    public List<String> showAllNameNotDuplicate() {
        return fileCSVDao.showList()
                         .stream()
                         .map(house -> house.getName())
                         .distinct()
                         .collect(Collectors.toList());
    }

    @Override
    public House addNewService(House newHouse) {
        return fileCSVDao.save(newHouse);
    }

    @Override
    public List<House> showServices() {
        return fileCSVDao.showList();
    }
}
