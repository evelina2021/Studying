package lesson10;

import java.util.ArrayList;

public class PhoneUtils {
    public static void printAllPhonesByProduction(ArrayList<Phone> phones, String production) {
        for (Phone phone : phones) {
            if (phone.getProizvoditel().equals(production)) {
                System.out.println(phone.toString());
            }
        }
    }

    public static void printTheBigestResolution(ArrayList<Phone> phones) {
        Phone bigestPhone = phones.get(0);
        for (Phone phone : phones) {
            if (phone.getDiagonal() > bigestPhone.getDiagonal()) {
                bigestPhone = phone;
            }
        }
        System.out.println(bigestPhone);
    }

    public static void printTheSmallestResolution(ArrayList<Phone> phones) {
        Phone smallestPhone = phones.get(0);
        for (Phone phone : phones) {
            if (phone.getDiagonal() < smallestPhone.getDiagonal()) {
                smallestPhone = phone;
            }
        }
        System.out.println(smallestPhone);
    }

    public static void printTheMediumResolution(ArrayList<Phone> phones) {
        double summ = 0;
        for (Phone phone : phones) {
            summ = summ + phone.getDiagonal();
        }
        System.out.println(summ / phones.size());
    }
}
