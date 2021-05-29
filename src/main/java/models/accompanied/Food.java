package models.accompanied;

import models.AccompaniedService;

/**
 * dịch vụ thức ăn
 */
public class Food extends AccompaniedService {
    public Food(String id) {
        super(id);
    }

    public Food(String id, String name, int amount, double price) {
        super(id, name, amount, price);
    }

    @Override
    protected String showInfo() {
        return null;
    }
}
