package Lesson02.Ex01;

public class Animal {

    int age;
    double weight;
    boolean sex;
    String ration;

    public Animal(int age, double weight, boolean sex, String ration) {
        super();
        this.age = age;
        this.weight = weight;
        this.sex = sex;
        this.ration = ration;
    }

    public Animal() {
        super();
    }

    public void getVoice() {
    }

    public String toString() {

        return " age=" + age + ", weight=" + weight + ", sex=" + sex + ", ration=" + ration ;
    }
}