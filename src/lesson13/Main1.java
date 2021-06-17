package lesson13;

import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new StringReverseComparator());
        treeSet.add("aaaa");
        treeSet.add("dddd");
        treeSet.add("ejgh");
        treeSet.add("bbbb");

        System.out.println(treeSet);
    }
}
