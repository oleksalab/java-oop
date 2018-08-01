package Lesson01.Ex01;

public class Car {

    private String name;
    private String color;
    private double speed = 0;

    public Car() {

        System.out.println("The Best Car is");
    }

    public Car(String name) {

        System.out.println("Car [" + name + "]");

        this.name = name;
    }

    public Car(String name, int speed) {

        System.out.println("Car [" + name + "] has speed : " + speed);

        this.name = name;
        this.speed = speed;
    }

    public Car(String name, int speed, String color) {

        System.out.println("Car [" + name + "] has speed : " + speed + " & color : " + color);

        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setSpeed(double speed) {

        this.speed = speed;
    }

    public String getName() {

        return name;
    }

    public String getColor() {

        return color;
    }

    public double getSpeed() {

        return speed;
    }

    public String toString() {

        StringBuilder buffer = new StringBuilder();

        buffer.append("{ name = ");
        buffer.append(this.name);
        buffer.append(", color = ");
        buffer.append(this.color);
        buffer.append(", speed = ");
        buffer.append(this.speed);
        buffer.append(" }");

        return buffer.toString();
    }


}
