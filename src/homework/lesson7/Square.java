package homework.lesson7;

public class Square extends GeometricFigure {
    public Square() {
        super();
    }

    public static double countAreaSquare(double sideA, double sideB, double sideC, double sideD) {
        if ((sideA + sideB < sideC + sideD) || (sideB + sideC < sideD + sideA) || (sideA + sideB > sideC + sideD) || (sideB + sideC > sideD + sideA)) {
            System.out.println("Значения сторон квадрата должны быть равны!");
            return 0;
        }
        double areaSquare = sideA * sideB;
        System.out.println("\n" + "Площадь квадрата = " + areaSquare);
        return areaSquare;
    }
}
