package dao.impl;

import dao.AbstractDao;
import dao.ServiceDao;
import models.rent.House;

import java.util.List;

public class HouseDao extends ServiceDao<House> {
    @Override
    public House add(House house) {
        return null;
    }

    @Override
    public House getDetail(String id) {
        return null;
    }

    @Override
    public List<House> showList() {
        return null;
    }

    @Override
    public House update(House house) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<House> showAllNameNotDuplicate() {
        return null;
    }

    /**
     * cho phép hiển thị danh sách Customer trong file Customer.CSV
     * được đánh số thứ tự để thực hiện việc lựa chọn booking cho Customer nào và trình đơn sau
     */
    public void addNewBooking(){

    }
}
