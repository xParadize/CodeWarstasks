/*
You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

Implement the function which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:

[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
Note: For 4 or more names, the number in "and 2 others" simply increases.
*/

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
