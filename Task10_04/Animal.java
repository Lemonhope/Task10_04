package Task10_04;

import java.io.Serializable;

public class Animal implements Serializable {
    private int age;
    private String name;
    private String color;

    public Animal(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
