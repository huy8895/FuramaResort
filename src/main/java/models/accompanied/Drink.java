package models.accompanied;

import models.AccompaniedService;

/**
 * dịch vụ nước uống
 */
public class Drink extends AccompaniedService {
    public Drink(String id) {
        super(id);
    }

    public Drink(String id, String name, int amount, double price) {
        super(id, name, amount, price);
    }

    @Override
    protected String showInfo() {
        return null;
    }
}
