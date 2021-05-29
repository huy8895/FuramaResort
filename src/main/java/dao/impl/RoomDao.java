package dao.impl;

import dao.ServiceDao;
import models.rent.House;
import models.rent.Room;
import util.FileDao;

import java.util.List;
import java.util.stream.Collectors;

public class RoomDao extends ServiceDao<Room> {

    private static final String FILE_PATH = "src/main/java/data/House.csv";

    protected RoomDao() {
        super(FILE_PATH, Room.class);
    }


    @Override
    public List<String> showAllNameNotDuplicate() {
        return fileDao.showList()
                      .stream()
                      .map(room -> room.getName())
                      .distinct()
                      .collect(Collectors.toList());
    }

    @Override
    public Room addNewServices(Room t) {
        return fileDao.save(t);
    }

    @Override
    public List<Room> showServices() {
        return fileDao.showList();
    }
}
