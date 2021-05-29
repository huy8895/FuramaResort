package models;

import enums.EducationLevel;
import enums.Position;
import enums.Department;

public class Employee {
    private String fullName;
    private String birthday;
    /**
     * số cmnd ;
     */
    private String idCardNumber;

    private String phoneNumber;
    private String email;
    /**
     *  Trình độ
     */
    private EducationLevel level;

    /**
     * vị trí
     */
    private Position position;

    /**
     * bộ phận làm việc
     */
    private Department department;

    public Employee(String fullName, String birthday, String idCardNumber, String phoneNumber, String email, EducationLevel level, Position position, Department department) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = level;
        this.position = position;
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EducationLevel getLevel() {
        return level;
    }

    public void setLevel(EducationLevel level) {
        this.level = level;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
