package Lesson03.Task03;

import Lesson03.Task02.Student;
import Lesson03.Task03.GroupFullException;
import Lesson03.Task03.UnknownStudentException;

import java.io.*;

public class Group {

    private Student[] students;

    public Group() {

        this.students = new Student[10];
    }

    public boolean loadGroup(String filePath) throws GroupFullException {

        boolean result = false;

        try (BufferedReader file = new BufferedReader(new FileReader(filePath))) {

            String line = "";
            while ((line = file.readLine()) != null) {

                String[] data = line.split(",");
                this.add(new Student(data[0], Integer.valueOf(data[1]), data[2], data[3]));
            }

        } catch (IOException ioe) {

            ioe.printStackTrace();
        }

        return result;
    }

    // сохранение данных о группе в файл
    public boolean saveGroup(String filePath) {

        boolean result = false;

        try (BufferedWriter file = new BufferedWriter(new FileWriter(filePath))) {

            String line = "";
            for (Student student : students) {

                line = student.getName() + ',' + student.getYear() + ',' + student.getHome() + ',' + student.getCollege();
                file.write(line);
                file.write(System.lineSeparator());
            }

            result = true;

        } catch (IOException ioe) {

            ioe.printStackTrace();
        }

        return result;
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
            result.append(System.lineSeparator());
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
