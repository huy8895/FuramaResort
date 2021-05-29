package models.accompanied;

import models.AccompaniedService;

/**
 * dịch vụ massage
 */
public class Massage extends AccompaniedService {

    public Massage(String id, String name, int amount, double price) {
        super(id, name, amount, price);
    }

    @Override
    protected String showInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "Massage{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }
}
