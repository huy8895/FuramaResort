package models.rent;

import models.RentService;

public class Villa extends RentService {
    /**
     * tiêu chuẩn phòng;
     */
    private String rate;
    /**
     * mô tả tiện nghi khác.
     */
    private String description;
    /**
     * diện tích bể bơi.
     */
    private int poolArea;

    /**
     * số tầng
     */
    private int numberFloors;

    public Villa(String id, String rate, String description, int poolArea, int numberFloors) {
        super(id);
        this.rate = rate;
        this.description = description;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public Villa(String id) {
        super(id);
    }

    public Villa() {
        super();
    }

    @Override
    protected String showInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "Villa{" +
                "name='" + name + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxNumberPeople=" + maxNumberPeople +
                ", rentalType=" + rentalType +
                ", id='" + id + '\'' +
                ", rate='" + rate + '\'' +
                ", description='" + description + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloors=" + numberFloors +
                '}';
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }
}
