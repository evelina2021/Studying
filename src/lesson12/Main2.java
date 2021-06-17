package lesson12;

import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        set.add("ccc");
        set.add("vvv");

        System.out.println(set);
    }
}
