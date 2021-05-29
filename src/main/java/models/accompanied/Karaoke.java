package models.accompanied;

import models.AccompaniedService;

/**
 * dịch vụ karaoke
 */
public class Karaoke extends AccompaniedService {

    public Karaoke(String id, String name, int amount, double price) {
        super(id, name, amount, price);
    }

    @Override
    protected String showInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "Karaoke{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }
}
