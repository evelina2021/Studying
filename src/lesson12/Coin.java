package lesson12;

public class Coin {
   private double diametr;
   private double ves;
   private String metal;
   private int nominal;

    public Coin() {
    }

    public Coin(double diametr, double ves, String metal, int nominal) {
        this.diametr = diametr;
        this.ves = ves;
        this.metal = metal;
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public double getVes() {
        return ves;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "diametr=" + diametr +
                ", ves=" + ves +
                ", metal='" + metal + '\'' +
                ", nominal=" + nominal +
                '}';
    }
}
