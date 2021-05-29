package models.accompanied;

import models.AccompaniedService;

/**
 * dịch vụ thuê xe tham quan
 */
public class RentCar extends AccompaniedService {
    public RentCar(String id) {
        super(id);
    }

    @Override
    protected String showInfo() {
        return null;
    }
}
