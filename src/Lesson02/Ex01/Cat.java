package Lesson02.Ex01;

import java.util.Objects;

public class Cat extends Animal {

    String name;
    String type;

    public Cat(int age, double weight, boolean sex, String ration, String name, String type) {

        super(age, weight, sex, ration);
/*
        super();
        this.age = age;
        this.weight = weight;
        this.sex = sex;
        this.ration = ration;
*/
        this.name = name;
        this.type = type;
    }

    @Override
    public void getVoice() {
        System.out.println("May - May");
    }

    @Override
    public String toString() {
        return "Cat : name=" + name + ", type=" + type + "," + super.toString();
    }

    @Override
    public boolean equals(Object o) {

        Cat cat = (Cat) o;

        return this.type == cat.type;
        //return Objects.equals(type, cat.type);
        //return Objects.equals(this.sex, cat.sex);
    }

    @Override
    public int hashCode() {

        return Objects.hash(type);
    }
}
