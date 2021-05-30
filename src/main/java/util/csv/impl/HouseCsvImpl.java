package util.csv.impl;

import enums.RentalType;
import models.rent.House;
import util.csv.CsvUtilImpl;

import java.util.Map;

public class HouseCsvImpl extends CsvUtilImpl<House> {
    public House fromCsv(String csvLine) {
        Map<String, String> map = getMapFieldNameAndValue(csvLine, House.class);

        String id = map.get("id");
        String rate = map.get("rate");
        String description = map.get("description");
        int numberFloors = Integer.parseInt(map.get("numberFloors"));
        String name = map.get("name");
        int usableArea = Integer.parseInt(map.get("usableArea"));
        double rentalCost = Double.parseDouble(map.get("rentalCost"));
        int maxNumberPeople = Integer.parseInt(map.get("maxNumberPeople"));
        RentalType rentalType = RentalType.valueOf(map.get("rentalType"));
        return new House(id, name, usableArea, rentalCost, maxNumberPeople, rentalType, rate, description, numberFloors);
    }


}
