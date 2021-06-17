package homework.lesson3;

public class Main1 {
    public static void main(String[] args) {

        int summa = 0;
        for (int i = 50; i <= 1000; i++) {
            if (i % 7 == 0 && i % 19 == 0) {
                summa = i + summa;
            }
        }
        System.out.println(summa);

    }
}
