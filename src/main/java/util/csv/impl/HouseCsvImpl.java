package util.csv.impl;

import enums.RentalType;
import models.rent.House;
import util.csv.CsvUtilImpl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class HouseCsvImpl extends CsvUtilImpl<House> {
    public House fromCsv(String csvLine) {
        Map<String, String> map = getMap(csvLine);
        String id = map.get("id");
        String rate = map.get("rate");
        String description = map.get("description");
        int numberFloors = Integer.parseInt(map.get("numberFloors"));
        String name = map.get("name");
        int usableArea = Integer.parseInt(map.get("usableArea"));
        double rentalCost = Double.parseDouble(map.get("rentalCost"));
        int maxNumberPeople = Integer.parseInt(map.get("maxNumberPeople"));
        RentalType rentalType = RentalType.valueOf(map.get("rentalType"));
        House house = new House(id, name, usableArea, rentalCost, maxNumberPeople, rentalType, rate, description, numberFloors);
        return house;
    }

    private Map<String, String> getMap(String csvLine) {
        List<String> allField = getAllField(House.class);
        String[] values = csvLine.split(",");
        Map<String, String> map = new HashMap<>();
        AtomicInteger atomicInteger = new AtomicInteger(0);

        Arrays.stream(values)
              .forEach(value ->
                      map.put(allField.get(atomicInteger.getAndIncrement()), value)
              );
        return map;
    }
}
