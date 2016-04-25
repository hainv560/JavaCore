package com.smartosc.demo.core.basic;

/**
 * Created by smartosc on 4/25/2016.
 */
public class ObjectClass {
    //Object class: Root or super class of hierarchy. Which present for java.lang package.
    // common method of Object class: equals() , hashcode(),toString()
    private int age;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObjectClass that = (ObjectClass) o;

        return age == that.age;

    }

    @Override
    public int hashCode() {
        return age;
    }

    @Override
    public String toString() {
        return "ObjectClass{" +
                "age=" + age +
                '}';
    }

}
