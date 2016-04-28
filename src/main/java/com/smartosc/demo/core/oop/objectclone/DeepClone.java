package com.smartosc.demo.core.oop.objectclone;

/**
 * Created by smartosc on 4/28/2016.
 */
public class DeepClone implements Cloneable {
    private Integer id;
    private Employee employee;

    public DeepClone() {
    }

    public DeepClone(Integer id, Employee employee) {
        this.id = id;
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new DeepClone(id, new Employee());
    }

    @Override
    public String toString() {
        return "DeepClone{" +
                "id=" + id +
                ", employee = " + employee.getAge() + " and " + employee.getName() +
                '}';
    }

    public static void main(String[] args) {
        DeepClone deepClone = new DeepClone(1, new Employee(23, "Lan"));
        System.out.println(deepClone);
        try {
            DeepClone cloneObject = (DeepClone) deepClone.clone();
            System.out.println(cloneObject);

            cloneObject.setId(2);
            cloneObject.getEmployee().setAge(24);
            cloneObject.getEmployee().setName("Hai");

            System.out.println("Changing clone object: " + cloneObject);
            System.out.println("Origin after change clone object value: " + deepClone);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}

class Employee {
    private Integer age;
    private String name;

    public Employee(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Employee() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}