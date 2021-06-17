package homework.lesson7;

public class Triangle extends GeometricFigure {
    public Triangle() {
        super();
    }

    public static double countAreaTriangle(double sideA, double sideB, double sideC) {
        if ((sideA + sideB < sideC) || (sideC + sideB < sideA) || (sideA + sideC < sideB)) {
            System.out.println("Значения сторон треугольника должны быть равны!");
            return 0;
        }
        double semiPerimetr = (sideA + sideB + sideC) / 2;
        double areaTriangle = Math.sqrt(semiPerimetr * (semiPerimetr - sideA) * (semiPerimetr - sideB) * (semiPerimetr - sideC));
        System.out.println("Площадь треугольника = " + areaTriangle);
        return areaTriangle;
    }
}
