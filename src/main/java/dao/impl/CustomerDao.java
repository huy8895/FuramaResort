package dao.impl;

import dao.AbstractDao;
import models.Customer;

import java.util.List;

public class CustomerDao implements AbstractDao<Customer> {
    @Override
    public Customer add(Customer customer) {
        return null;
    }

    @Override
    public Customer getDetail(String id) {
        return null;
    }

    @Override
    public List<Customer> showList() {
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    /**
     * Cài đặt lại phương thức showInformationCustomer()
     * để dữ liệu xuất ra được sắp xếp theo thứ tự Alpha B theo tên của từng Customer.
     */
    public String showInformationCustomer(){
        return null;
    }
}
