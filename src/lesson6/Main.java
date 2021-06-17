package lesson6;

public class Main {
    public static void main(String[] args) {
        int count = StringUtils.countSpaceInText("sf kajl slekjd dofj");
        System.out.println(count);
        String text = StringUtils.replaceGlasToUppercase("Любой абсолютно текст");
        System.out.println(text);
        NumberUtils.printMin(2,2,2,5);
        StringUtils.printWordsRevers("аргентина манит негра");

    }
}
