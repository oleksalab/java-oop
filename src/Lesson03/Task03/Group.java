package Lesson03.Task03;

import Lesson03.Task02.Student;

public class Group {

    private Student[] students;

    public Group() {

        this.students = new Student[10];
    }

    public boolean add(Student student) throws GroupFullException {

        System.out.println("Добавление студента : " + student.getName());

        for (int i = 0; i < students.length; i++) {

            if (students[i] == null) {
                students[i] = student;

                return true;
            }
        }

        throw new GroupFullException(student);
    }

    public boolean remove(Student student) throws UnknownStudentException {

        System.out.println("Удаление студента : " + student.getName());

        for (int i = 0; i < students.length; i++) {

            if (student.equals(students[i])) {
                students[i] = null;

                return true;
            }
        }

        throw new UnknownStudentException(student);
    }

    @Override
    public String toString() {

        // сортируем список
        sortList(students);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < students.length; i++) {

            result.append(students[i]);
            result.append("\n");
        }

        return result.toString();
    }

    // сортировка списка
    private void sortList(Student list[]) {

        for (int i = 0; i < list.length - 1; i++) {

            for (int j = 0; j < list.length - i - 1; j++) {

                if (compareByName(list[j], list[j + 1])) {

                    Student temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    // сравнение двух строк
    private boolean compareByName(Student student1, Student student2) {

        int result = 0;

        try {

            result = student1.getName().compareTo(student2.getName());

        } catch (NullPointerException npe) {

            result = 0;
        }

        return (result > 0) ? true : false;
    }

}
