package homework.lesson7;

public class Main {
    public static void main(String[] args) {
        GeometricFigure name1 = new GeometricFigure("Квадрат", 4);
        Square.countAreaSquare(3, 3, 3, 3);

        GeometricFigure name2 = new GeometricFigure("Треугольник", 3);
        Triangle.countAreaTriangle(5, 5, 5);

        GeometricFigure name3 = new GeometricFigure("Прямоугольник", 4);
        Rectangle.countAreaRectangle(1, 3, 1, 3);

        GeometricFigure name4 = new GeometricFigure("Круг", 1);
        Circle.countAreaCircle(5);

        GeometricFigure[] name = new GeometricFigure[4];
        name[0] = name1;
        name[1] = name2;
        name[2] = name3;
        name[3] = name4;

        for (int i = 0; i < name.length; i++) {
            name[i].printInfo();
        }
    }
}