package lesson10.interfaces;

import java.util.Objects;

public class FractionalNumber implements FractionNumber {

    private int dividend;
    private int divisor;

    public FractionalNumber() {
    }

    public FractionalNumber(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    @Override
    public int getDividend() {
        return dividend;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.divisor = divisor;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public double value() {
        return dividend / (double) divisor;
    }

    public void sokrashenie() {
        // 5/15, 2/16, 3/9, 4/10
        for (int i = Math.min(dividend, divisor); i >= 2; i--) {
            if (dividend % i == 0 && divisor % i == 0) {
                dividend = dividend / i;
                divisor = divisor / i;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FractionalNumber)) return false;
        FractionalNumber that = (FractionalNumber) o;
        return getDividend() == that.getDividend() &&
                getDivisor() == that.getDivisor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDividend(), getDivisor());
    }

    @Override
    public String toString() {
        return dividend + "/" + divisor;
    }
}
