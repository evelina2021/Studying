package homework.lesson7;

public class GeometricFigure {
    public GeometricFigure() {
        super();
    }

    private String name;
    private int numberOfSides;

    public GeometricFigure(String name, int numberOfSides) {
        this.name = name;
        this.numberOfSides = numberOfSides;
    }

    public void printInfo() {
        System.out.printf("Геометрическая фигура: %s, количество сторон - %d. \n", this.name, this.numberOfSides);
    }
}