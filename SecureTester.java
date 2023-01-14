package CodeWars;
import java.util.*;
public class SecureTester{
    public static boolean alphanumeric(String s){
        if (s.equals("") || s.contains(" ") || s.contains("_")) {
            return false;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (!(chars[i] > 47 && chars[i] < 58) && !(chars[i] > 64 && chars[i] < 91) && !(chars[i] > 96 && chars[i] < 123)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(alphanumeric(""));
        System.out.println(alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
        System.out.println(alphanumeric("naïve"));
        System.out.println(alphanumeric("abc_d"));
        System.out.println(alphanumeric("abc/d"));
        System.out.println(alphanumeric("abc45d"));

    }
}
