package homework.lesson6;


public class StringUtils {
    // Написать метод, который будет считать площадь треугольника. Входящие параметры в метод - 3 стороны треугольника.
    public static double countAreaTriangle(double sideA, double sideB, double sideC) {
        // Проверка на правильность треугольника:
        if ((sideA + sideB < sideC) || (sideC + sideB < sideA) || (sideA + sideC < sideB)) {
            return 0;
        }
        double semiPerimetr = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(semiPerimetr * (semiPerimetr - sideA) * (semiPerimetr - sideB) * (semiPerimetr - sideC));
        return area;
    }

    // Написать метод. В метод передаем 4 числа: числитель 1, числитель 2, знаменатель 1, знаменатель 2.
    // В методе посчитать сумму двух этих дробей и вывести на консоль результат.
    public static double countSumOfFractions(double num1, double num2, double denom1, double denom2) {
        double sum = 0;
        double nok = denom1 * denom2;
        double comDiv = nok / denom1 / denom2;
        sum = (num1 * denom2 + num2 * denom1) / nok;
        return sum;
    }
}