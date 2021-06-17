package lesson10.interfaces;

public class Main1 {
    public static void main(String[] args) {

        FractionalNumber drob1 = new FractionalNumber(3, 4);
        FractionalNumber drob2 = new FractionalNumber(2, 6);

        FractionNumberOperationImpl calculator = new FractionNumberOperationImpl();
        FractionNumber resultAdd = calculator.add(drob1, drob2);
        System.out.println(resultAdd);

        FractionNumberOperationImpl calculator2 = new FractionNumberOperationImpl();
        FractionNumber resultSub = calculator2.sub(drob1, drob2);
        System.out.println(resultSub);

        FractionNumberOperationImpl calculator3 = new FractionNumberOperationImpl();
        FractionNumber resultMul = calculator3.mul(drob1, drob2);
        System.out.println(resultMul);

        FractionNumberOperationImpl calculator4 = new FractionNumberOperationImpl();
        FractionNumber resultDiv = calculator4.div(drob1, drob2);
        System.out.println(resultDiv);
    }
}
