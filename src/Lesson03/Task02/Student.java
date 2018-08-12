package Lesson03.Task02;

import Lesson03.Task01.Person;

import java.util.Objects;

public class Student extends Person {

    private String college;

    public Student(String name, int year, String home) {

        super(name, year, home);
    }

    public Student(String name, int year, String home, String college) {

        super(name, year, home);
        this.college = college;
    }

    public void setCollege(String college) {

        this.college = college;
    }

    public String getCollege() {

        return college;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        // сравниваем объекты по полям
        boolean isEqualName = Objects.equals(getName(), student.getName());
        boolean isEqualYear = Objects.equals(getYear(), student.getYear());
        boolean isEqualHome = Objects.equals(getHome(), student.getHome());
        boolean isEqualCollege = Objects.equals(getCollege(), student.getCollege());

        return isEqualName && isEqualYear && isEqualHome && isEqualCollege;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCollege());
    }

    @Override
    public String toString() {

        StringBuilder profile = new StringBuilder();
        profile.append("Student { ");
        profile.append("Name = '");
        profile.append(getName());
        profile.append("', College = '");
        profile.append(this.college);
        profile.append("', Year = ");
        profile.append(getYear());
        profile.append(", Home = '");
        profile.append(getHome());
        profile.append("' }");

        return profile.toString();
    }

}
