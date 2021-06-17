package lesson13;

import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar(120, "Мышка", 3.7);
        Tovar tovar2 = new Tovar(500, "Клавиатура", 4.7);
        Tovar tovar3 = new Tovar(30000, "Моноблок", 5);

        TreeSet<Tovar> tovars = new TreeSet<>();
        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);

        TovarUtils.sortByName(tovars);

        for (Tovar t : tovars) {
            System.out.println(t);
        }
    }
}
