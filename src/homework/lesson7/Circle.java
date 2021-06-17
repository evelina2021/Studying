package homework.lesson7;

public class Circle extends GeometricFigure {
    public Circle() {
        super();
    }

    public static double countAreaCircle(double side) {
        double pi = 3.14;
        double numbPart = 4;
        double areaCircle = side * side / (numbPart * pi);
        System.out.println("Площадь круга = " + areaCircle + "\n");
        return areaCircle;
    }
}
