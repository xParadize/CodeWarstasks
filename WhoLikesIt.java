package CodeWars;

import java.util.*;


public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        ArrayList<String> list = new ArrayList<>(List.of(names));
        if (names.length == 0) {
            return "no one likes this";
        }
        if (names.length == 1) {
            return "" + list.get(0) + " likes this";
        }
        if (names.length == 2) {
            return "" + list.get(0) + " and " + list.get(1) + " like this";
        }
        if (names.length == 3) {
            return "" + list.get(0) + ", " + list.get(1) + " and " + list.get(2) + " like this";
        }
        else {
            return "" + list.get(0) + ", " + list.get(1) + " and " + (names.length - 2) + " others like this";
        }
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Jacob", "Alex"));
        System.out.println(whoLikesIt("Max", "John", "Mark"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
