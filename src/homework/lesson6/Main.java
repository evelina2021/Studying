package homework.lesson6;

public class Main {
    public static void main(String[] args) {
        double area = StringUtils.countAreaTriangle(5, 5, 5);
        if (area != 0) {
            System.out.println("Площадь треугольника = " + area);
        } else {
            System.out.println("Треугольника с такими сторонами не существует!");
        }

        double sum = StringUtils.countSumOfFractions(6, 1, 4, 8);
        System.out.println(sum);

    }
}