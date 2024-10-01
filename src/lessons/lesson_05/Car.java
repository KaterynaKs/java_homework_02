package lessons.lesson_05;

import java.lang.ref.SoftReference;

public class Car {
    private String name;
    private int year;
    //    default constructor
    public Car() {}

    public Car(String name) {
        this.name = name;
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", year: " + this.year;
    }
}