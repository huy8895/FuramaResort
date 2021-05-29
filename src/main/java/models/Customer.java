package models;

import enums.*;

import java.util.List;

public class Customer {
    private String fullName;
    private String birthday;
    /**
     * giới tính
     */
    private Gender gender;
    /**
     * số cmnd ;
     */
    private String idCardNumber;

    private String phoneNumber;
    private String email;
    /**
     *  loại khách hàng.
     */
    private CustomerType level;

    /**
     * địa chỉ
     */
    private String address;

    /**
     * dịch vụ sử dụng.
     */
    private List<Services> servicesUsed;

    private Contract contract;
}
