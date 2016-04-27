package com.smartosc.demo.core.oop.aggregation;

/**
 * Created by smartosc on 4/27/2016.
 */
public class AggregationClass {

    // For Code Reuse ability.

    public static void main(String[] args) {
        Address address = new Address("HTM", "Ha Noi", "Viet Nam");
        Employee employee = new Employee(1, "Hai");
        employee.setAddress(address);
        System.out.println(employee);
    }
}
