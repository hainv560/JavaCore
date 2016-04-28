package com.smartosc.demo.core.oop.objectclone;

/**
 * Created by smartosc on 4/28/2016.
 */

/*
* Shallow copy is default clone in java
Shallow clone is a copying the reference pointer to the object,
which mean the new object is pointing to the same memory reference of the old object. The memory usage is lower.
*/

public class ShallowCopy implements Cloneable {
    private Address address;
    private Integer id;

    public ShallowCopy() {
    }

    public ShallowCopy(Address address, Integer id) {
        this.address = address;
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // shallow copy
    }

    @Override
    public String toString() {
        return "ShallowCopy{" +
                "address = " + address.getStreet() + " and " + address.getCity() +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        ShallowCopy shallowCopy = new ShallowCopy(new Address("HTM", "Ha Noi"), 1);
        System.out.println(shallowCopy);
        try {
            ShallowCopy cloneObject = (ShallowCopy) shallowCopy.clone();
            System.out.println(cloneObject);

            shallowCopy.setId(3);
            shallowCopy.getAddress().setStreet("Xuan Thuy");
            shallowCopy.getAddress().setCity("Vung Tau");

            System.out.println("After change origin: " + shallowCopy);

            System.out.println("Clone object after change origin: " + cloneObject);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class Address {
    private String street;
    private String city;

    public Address() {
    }

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}