package Lesson08.Ex01;

public class Animal implements Cloneable {

    private String family;

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

}
