package lesson10.interfaces;

public class FractionNumberOperationImpl implements FractionNumberOperation {

    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int resultDividend = a.getDividend() * b.getDivisor() +
                a.getDivisor() * b.getDividend();
        int resultDivisor = a.getDivisor() * b.getDivisor();
        FractionalNumber result = new FractionalNumber(resultDividend, resultDivisor);
        result.sokrashenie();
        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        int resultDividend = a.getDividend() * b.getDivisor() -
                a.getDivisor() * b.getDividend();
        int resultDivisor = a.getDivisor() * b.getDivisor();
        FractionalNumber result = new FractionalNumber(resultDividend, resultDivisor);
        result.sokrashenie();
        return result;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        int resultDividend = a.getDividend() * b.getDividend();
        int resultDivisor = a.getDivisor() * b.getDivisor();
        FractionalNumber result = new FractionalNumber(resultDividend, resultDivisor);
        result.sokrashenie();
        return result;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        int resultDividend = a.getDividend() * b.getDivisor();
        int resultDivisor = a.getDivisor() * b.getDividend();
        FractionalNumber result = new FractionalNumber(resultDividend, resultDivisor);
        result.sokrashenie();
        return result;
    }
}
