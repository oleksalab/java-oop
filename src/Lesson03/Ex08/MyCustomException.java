package Lesson03.Ex08;

public class MyCustomException extends Exception {

    public String getMessage() {

        return "Вызов моего исключения!";
    }
}
