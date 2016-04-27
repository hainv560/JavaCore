package com.smartosc.demo.core.oop.aggregation;

/**
 * Created by smartosc on 4/27/2016.
 */
public class Employee {
    private Integer id;
    private String name;
    private Address address;


    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id =" + id +
                ", name ='" + name + '\'' +
                ", address = " + address.getStreet() + " " + address.getCity() + " " + address.getCountry() +
                '}';
    }
}
