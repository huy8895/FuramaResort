package models.accompanied;

import models.AccompaniedService;

/**
 * dịch vụ thuê xe tham quan
 */
public class RentCar extends AccompaniedService {

    public RentCar(String id, String name, int amount, double price) {
        super(id, name, amount, price);
    }

    @Override
    protected String showInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "RentCar{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }
}
