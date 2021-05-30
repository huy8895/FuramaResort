package models.rent;

import enums.RentalType;
import models.AccompaniedService;
import models.RentService;

import java.util.List;

public class Room extends RentService {
    /**
     * Dịch vụ miễn phí đi kèm
     */
    String freeServicesIncluded;

    public Room(String id, String name, int usableArea, double rentalCost, int maxNumberPeople, RentalType rentalType, String freeServicesIncluded) {
        super(id, name, usableArea, rentalCost, maxNumberPeople, rentalType);
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

    public String getFreeServicesIncluded() {
        return freeServicesIncluded;
    }

    public void setFreeServicesIncluded(String freeServicesIncluded) {
        this.freeServicesIncluded = freeServicesIncluded;
    }
}
