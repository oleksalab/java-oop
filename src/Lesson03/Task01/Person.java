package Lesson03.Task01;

public class Person {

    private String name;
    private int year;
    private String home;

    public Person() {
    }

    public Person(String name, int year, String home) {

        this.name = name;
        this.year = year;
        this.home = home;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public void setHome(String home) {

        this.home = home;
    }

    public String getName() {

        return name;
    }

    public int getYear() {

        return year;
    }

    public String getHome() {

        return home;
    }

    @Override
    public String toString() {

        StringBuilder profile = new StringBuilder();
        profile.append("Person { ");
        profile.append("Name = '");
        profile.append(this.name);
        profile.append("', Year = ");
        profile.append(this.year);
        profile.append(", Home = '");
        profile.append(this.home);
        profile.append("' }");

        return profile.toString();
    }

}
