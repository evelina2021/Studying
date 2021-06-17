package lesson4;

public class Main4 {
    public static void main(String[] args) {
        String text = "Java is the ..";

        char [] simbolsFromText = text.toCharArray();

        for (int i = simbolsFromText.length - 1; i >= 0; i--) {
            System.out.println(simbolsFromText[i]);
        }

    }
}
