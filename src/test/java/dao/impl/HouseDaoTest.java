package dao.impl;

import enums.RentalType;
import junit.framework.TestCase;
import models.rent.House;

import java.util.List;
import java.util.UUID;

public class HouseDaoTest extends TestCase {
    HouseDao houseDao = new HouseDao();

    public void testShowAllNameNotDuplicate() {
        houseDao.showAllNameNotDuplicate().forEach(System.out::println);
    }

    public void testAddNewService() {

        House house1 = new House(UUID.randomUUID().toString(),"house 1",1,12,3,RentalType.DAY,"tot","mota house 1", 3);
        House house2 = new House(UUID.randomUUID().toString(),"house 1",1,12,3,RentalType.DAY,"tot","mota house 1", 3);
        House house3 = new House(UUID.randomUUID().toString(),"house 2",1,12,3,RentalType.DAY,"tot","mota house 1", 3);
        House house4 = new House(UUID.randomUUID().toString(),"house 3",1,12,3,RentalType.DAY,"tot","mota house 1", 3);

        houseDao.addNewService(house1);
        houseDao.addNewService(house2);
        houseDao.addNewService(house3);
        houseDao.addNewService(house4);
    }

    public void testShowServices() {
        List<House> houses = houseDao.showServices();
        houses.forEach(System.out::println);
    }
}