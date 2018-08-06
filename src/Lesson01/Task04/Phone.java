package Lesson01.Task04;

import java.util.Objects;

public class Phone {

    private String number;

    public Phone() {
    }

    public Phone(String number) {

        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object checkPhone) {

        if (this == checkPhone) return true;
        if (checkPhone == null || getClass() != checkPhone.getClass()) return false;

        Phone phone = (Phone) checkPhone;
        return Objects.equals(number, phone.number);
    }

    @Override
    public int hashCode() {

        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Phone{" + "number='" + number + "'}";
    }

}
