package com.smartosc.demo.core.oop.encapsulation;

/**
 * Created by smartosc on 4/26/2016.
 */


public class EncapsulationTest {
    /*
      Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as as single unit
      To achieve encapsulation in Java:
          - Declare the variables of a class as private.
          - Provide public setter and getter methods to modify and view the variables values.
   */
    private String variable;

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }
}
