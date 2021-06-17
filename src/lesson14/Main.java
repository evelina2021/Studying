package lesson14;

public class Main {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.addProduct("Яблоко", 5);
        holodilnik.addProduct("Яблоко", 3);
        holodilnik.addProduct("Яблоко", 2);
        holodilnik.addProduct("Яблоко", 7);

        holodilnik.printAllProducts();
        holodilnik.getProduct("Яблоко", 30);
        holodilnik.printAllProducts();
    }
}


