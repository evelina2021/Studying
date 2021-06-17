package lesson3;

public class Main12 {
    public static void main(String[] args) {
        String text = "luboi pobolshe";
        int summa = 0;
        for (int i = 0; 1 < text.length(); i++){
            if (text.charAt(i)=='u' || text.charAt(i)=='o' || text.charAt(i)=='e' || text.charAt(i)=='i'){
               summa++;
            }
        }
    }
}
