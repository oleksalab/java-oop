package Lesson08.Ex05;

public class Compare implements Comparable<Object> {

    String string;
    int number;

    public Compare(String string, int number) {

        this.string = string;
        this.number = number;
    }

    @Override
    public int compareTo(Object object) {

        Compare other = (Compare) object;

        int result = string.compareTo(other.string);
        if (result != 0) {
            return result;
        }

        result = number - other.number;

        return result;
    }

    @Override
    public String toString() {

        return "number : " + number + ", string : " + string;
    }
}
