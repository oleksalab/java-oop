package Lesson01.Task04;

public class Network {

    String name;
    Phone[] phones;

    public Network(String name, int limit) {

        this.name = name;
        this.phones = new Phone[limit];
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Phone[] getPhones() {
        return phones;
    }

    public boolean registerPhone(Phone phone) {

        for (int i = 0; i < phones.length; i++) {

            if (phones[i] == null) {
                phones[i] = phone;

                return true;
            }
        }

        return false;
    }

    // проверка наличия телефона в сети
    public boolean isRegistered(Phone phone) {

        for (Phone item : phones) {

            if (item != null && item.equals(phone)) {

                return true;
            }
        }

        return false;
    }

    public boolean call(Phone fromPhone, Phone toPhone) {

        System.out.println("Кто : " + fromPhone.getNumber());
        System.out.println("Кому : " + toPhone.getNumber());

        if (isRegistered(fromPhone) && isRegistered(toPhone)) {

            return true;
        }

        return false;
    }

    @Override
    public String toString() {

        return "Network{" + "name='" + name + "'}";
    }


}
