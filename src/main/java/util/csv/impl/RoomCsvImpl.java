package util.csv.impl;

import enums.RentalType;
import models.rent.Room;
import util.csv.CsvUtilImpl;

import java.util.Map;

public class RoomCsvImpl extends CsvUtilImpl<Room> {

    public Room fromCsv(String csvLine) {
        Map<String, String> map = getMapFieldNameAndValue(csvLine, Room.class);

        String id = map.get("id");
        String name = map.get("name");
        int usableArea = Integer.parseInt(map.get("usableArea"));
        double rentalCost = Double.parseDouble(map.get("rentalCost"));
        int maxNumberPeople = Integer.parseInt(map.get("maxNumberPeople"));
        RentalType rentalType = RentalType.valueOf(map.get("rentalType"));
        String freeServicesIncluded = map.get("freeServicesIncluded");

        return new Room(id, name, usableArea, rentalCost, maxNumberPeople, rentalType,freeServicesIncluded);
    }
}
