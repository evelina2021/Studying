package homework.lesson4;

public class Main4 {
    public static void main(String[] args) {
        String text = "Я буду учиться лучше";

        String[] wordsOfText = text.split(" ");

        for (int i = wordsOfText.length - 1; i >= 0; i--) {
            System.out.println(wordsOfText[i]);
        }
    }
}