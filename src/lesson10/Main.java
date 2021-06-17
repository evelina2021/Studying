package lesson10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(8.5, "Intel Core", 8, "Galaxy", "Samsung");
        Phone phone2 = new Phone(5, "Intel", 4, "11PRO", "Apple");
        Phone phone3 = new Phone(5, "Pentium", 4, "GalaxyA", "Nokia");
        Phone phone4 = new Phone(3.5, "Atom Celeron", 2, "Galaxy", "Sony");
        Phone phone5 = new Phone(3.5, "Intel Core", 8, "Galaxy", "Samsung");
        Phone phone6 = new Phone(4.5, "Core I5", 16, "12PRO", "Apple");
        Phone phone7 = new Phone(4, "Intel Core", 8, "Galaxy", "Sony");
        Phone phone8 = new Phone(5.5, "Intel Pentium", 4, "Galaxy", "Apple");
        Phone phone9 = new Phone(4, "Intel Core", 2, "Galaxy", "Samsung");
        Phone phone10 = new Phone(5.5, "Intel Core", 2, "Galaxy", "Apple");
        Phone phone11 = new Phone(3.5, "Atom Celeron", 2, "Galaxy", "Sony");

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        phones.add(phone4);
        phones.add(phone5);
        phones.add(phone6);
        phones.add(phone7);
        phones.add(phone8);
        phones.add(phone9);
        phones.add(phone10);

        // PhoneUtils.printAllPhonesByProduction(phones,"Samsung");
        // PhoneUtils.printTheBigestResolution(phones);
        // PhoneUtils.printTheSmallestResolution(phones);
        PhoneUtils.printTheMediumResolution(phones);

        // 1 - вывести самый маленький телефон
        // 2 - вывести значение средней диагонали

        //* System.out.println(phone4.equals(phone11));
        // System.out.println(phone4.hashCode());
        // System.out.println(phone11.hashCode());
        // System.out.println(phone5.hashCode()); *//
    }
}
