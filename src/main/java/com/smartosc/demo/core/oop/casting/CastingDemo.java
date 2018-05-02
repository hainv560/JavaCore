package com.smartosc.demo.core.oop.casting;

/**
 * Created by smartosc on 4/27/2016.
 */
public class CastingDemo {
    public static void main(String[] args) {
        // Up casting: casting to a super type, happens automatically, no need to manually

        Dog dog = new Dog();
        Animal animal = dog; // automatically casting
        animal.show();
        // Down casting: casting to a sub type

        Animal animalDown = new Animal();
        Dog dogDown = (Dog) animalDown;
        // throw ClassCastException.because animal's runtime type is Animal,
        // and so when you tell the runtime to perform the cast it sees that animal isn't really a Dog and so throws a ClassCastException.

        // It's ok when use
        Animal animalDownOk = new Dog();
        Dog dogDownOk = (Dog) animalDownOk;
        dogDownOk.show();

    }
}
