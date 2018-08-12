package Lesson03.Task03;

import Lesson03.Task02.Student;

public class UnknownStudentException extends Exception {

    private Student student;

    public UnknownStudentException(Student student) {

        this.student = student;
    }

    @Override
    public String getMessage() {

        StringBuilder message = new StringBuilder();
        message.append("\nПопытка удалить :\n");
        message.append(student);
        message.append("\nВ группе нет такого студента!");

        return message.toString();
    }

}
