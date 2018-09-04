package Lesson11.Ex04;

import java.util.ArrayList;

public class Group {

    private String name;
    private ArrayList<Student> list = new ArrayList<>();

    public Group(String name) {
        super();

        this.name = name;
    }

    public void addStudent(Student a) {
        list.add(a);
    }

    public Student[] getGroup() {

        Student[] students = new Student[list.size()];

        for (int i = 0; i < list.size(); i++) {
            students[i] = list.get(i);
        }

        return students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
