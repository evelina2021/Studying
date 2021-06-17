package homework.lesson7;

public class Rectangle extends GeometricFigure {
    public Rectangle() {
        super();
    }

    public static double countAreaRectangle(double sideA, double sideB, double sideC, double sideD) {
        if ((sideA + sideB < sideC + sideD) || (sideA + sideB > sideC + sideD)) {
            System.out.println("Значения сторон AB и CD должны быть равны!");
            return 0;
        }

        double areaRectangle = (sideA + sideB) * (sideC + sideD);
        System.out.println("Площадь прямоугольника = " + areaRectangle);
        return areaRectangle;
    }
}
