package models.rent;

import models.AccompaniedService;
import models.RentService;

import java.util.List;

public class Room extends RentService {
    /**
     * Dịch vụ miễn phí đi kèm
     */
    List<AccompaniedService> freeServicesIncluded;

    public Room(String id) {
        super(id);
    }

    public Room(String id, List<AccompaniedService> freeServicesIncluded) {
        super(id);
        this.freeServicesIncluded = freeServicesIncluded;
    }

    @Override
    protected String showInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxNumberPeople=" + maxNumberPeople +
                ", rentalType=" + rentalType +
                ", id='" + id + '\'' +
                ", freeServicesIncluded=" + freeServicesIncluded +
                '}';
    }

    public List<AccompaniedService> getFreeServicesIncluded() {
        return freeServicesIncluded;
    }

    public void setFreeServicesIncluded(List<AccompaniedService> freeServicesIncluded) {
        this.freeServicesIncluded = freeServicesIncluded;
    }
}