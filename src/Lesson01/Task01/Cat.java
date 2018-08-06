package Lesson01.Task01;

public class Cat {

    // имя
    private String name;
    // порода
    private String kind;
    // вес (0.00 кг)
    private double weight;
    // возраст (0 мес)
    private double age;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, String kind, double weight, double age) {
        this.name = name;
        this.kind = kind;
        this.weight = weight;
        this.age = age;
    }


    void setName(String name) {
        this.name = name;
    }

    void setKind(String kind) {
        this.kind = kind;
    }

    void setWeight(double weight) {

        this.weight = weight;
    }

    void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public double getWeight() {
        return weight;
    }

    public double getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Cat : {" + "name='" + name + "'" + ", kind='" + kind + "'" + ", weight=" + weight + ", age=" + age + "}";
    }

}
