package Lesson03.Task03;

import Lesson03.Task02.Student;

public class GroupFullException extends Exception {

    private Student student;

    public GroupFullException(Student student) {

        this.student = student;
    }

    @Override
    public String getMessage() {

        StringBuilder message = new StringBuilder();
        message.append("\nПопытка добавить :\n");
        message.append(student);
        message.append("\nВ группе нет свободных мест!");

        return message.toString();
    }
}
