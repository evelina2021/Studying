package homework.lesson4;

public class Main3 {
    public static void main(String[] args) {
        String text = "Я буду учиться лучше";

        String[] wordsOfText = text.split(" ");

        for (int i = 0; i <= wordsOfText.length -1; i++) {
            System.out.println(wordsOfText[i]);
        }
    }
}