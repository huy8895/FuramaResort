package util.csv;

import enums.RentalType;
import junit.framework.TestCase;
import models.rent.House;
import models.rent.Room;
import models.rent.Villa;
import util.FileCSVDao;

import java.util.UUID;

public class FileCSVDaoTest extends TestCase {
    private static final String DATA_HOUSE_CSV = "src/main/java/data/House.csv";
    private static final String DATA_VILLA_CSV = "src/main/java/data/Villa.csv";
    private static final String DATA_ROOM_CSV = "src/main/java/data/Room.csv";
    FileCSVDao<House> houseFileCSVDao = new FileCSVDao<>(DATA_HOUSE_CSV, House.class);
    FileCSVDao<Villa> villaFileCSVDao = new FileCSVDao<>(DATA_VILLA_CSV, Villa.class);
    FileCSVDao<Room> roomFileCSVDao = new FileCSVDao<>(DATA_ROOM_CSV, Room.class);

    public void testAddNewHouse() {

        House house1 = new House(UUID.randomUUID().toString(),"house 1",1,12,3,RentalType.DAY,"tot","mota house 1", 3);
        House house2 = new House(UUID.randomUUID().toString(),"house 1",1,12,3,RentalType.DAY,"tot","mota house 1", 3);
        House house3 = new House(UUID.randomUUID().toString(),"house 2",1,12,3,RentalType.DAY,"tot","mota house 1", 3);
        House house4 = new House(UUID.randomUUID().toString(),"house 3",1,12,3,RentalType.DAY,"tot","mota house 1", 3);

        houseFileCSVDao.save(house1);
        houseFileCSVDao.save(house2);
        houseFileCSVDao.save(house3);
        houseFileCSVDao.save(house4);
    }

    public void testShowListHouse() {
        houseFileCSVDao.showList().forEach(System.out::println);
    }

    public void testAddNewVilla() {
        Villa villa1 = new Villa(UUID.randomUUID().toString(),"villa 1",1,12,3,RentalType.DAY,"tot","mota house 1", 100,3);
        Villa villa2 = new Villa(UUID.randomUUID().toString(),"villa 2",1,12,3,RentalType.DAY,"tot","mota house 1", 100,3);
        Villa villa3 = new Villa(UUID.randomUUID().toString(),"villa 3",1,12,3,RentalType.DAY,"tot","mota house 1", 100,3);
        Villa villa4 = new Villa(UUID.randomUUID().toString(),"villa 4",1,12,3,RentalType.DAY,"tot","mota house 1", 100,3);
        Villa villa5 = new Villa(UUID.randomUUID().toString(),"villa 1",1,12,3,RentalType.DAY,"tot","mota house 1", 100,3);

        villaFileCSVDao.save(villa1);
        villaFileCSVDao.save(villa2);
        villaFileCSVDao.save(villa3);
        villaFileCSVDao.save(villa4);
        villaFileCSVDao.save(villa5);
    }

    public void testShowListVilla() {
        villaFileCSVDao.showList().forEach(System.out::println);
    }

    public void testAddNewRoom() {
        Room room1 = new Room(UUID.randomUUID().toString(),"Room 1",1,12,3,RentalType.DAY,null);
        Room room2 = new Room(UUID.randomUUID().toString(),"Room 2",1,12,3,RentalType.DAY,null);
        Room room3 = new Room(UUID.randomUUID().toString(),"Room 3",1,12,3,RentalType.DAY,null);
        Room room4 = new Room(UUID.randomUUID().toString(),"Room 4",1,12,3,RentalType.DAY,null);
        Room room5 = new Room(UUID.randomUUID().toString(),"Room 5",1,12,3,RentalType.DAY,null);

        roomFileCSVDao.save(room1);
        roomFileCSVDao.save(room2);
        roomFileCSVDao.save(room3);
        roomFileCSVDao.save(room4);
        roomFileCSVDao.save(room5);
    }

    public void testShowListRoom() {
        roomFileCSVDao.showList().forEach(System.out::println);
    }


}