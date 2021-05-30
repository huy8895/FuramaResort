package dao.impl;

import dao.ServiceDao;
import models.rent.Room;

import java.util.List;
import java.util.stream.Collectors;

public class RoomDao extends ServiceDao<Room> {

    private static final String FILE_PATH = "src/main/java/data/Room.csv";

    protected RoomDao() {
        super(FILE_PATH, Room.class);
    }


    @Override
    public List<String> showAllNameNotDuplicate() {
        return fileCSVDao.showList()
                         .stream()
                         .map(room -> room.getName())
                         .distinct()
                         .collect(Collectors.toList());
    }

    @Override
    public Room addNewService(Room t) {
        return fileCSVDao.save(t);
    }

    @Override
    public List<Room> showServices() {
        return fileCSVDao.showList();
    }
}
