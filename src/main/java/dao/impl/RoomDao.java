package dao.impl;

import dao.AbstractDao;
import dao.ServiceDao;
import models.rent.Room;

import java.util.List;

public class RoomDao extends ServiceDao<Room> {
    @Override
    public Room add(Room room) {
        return null;
    }

    @Override
    public Room getDetail(String id) {
        return null;
    }

    @Override
    public List<Room> showList() {
        return null;
    }


    @Override
    public Room update(Room room) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    protected List<Room> showAllNameNotDuplicate() {
        return null;
    }
}
