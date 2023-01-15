package CodeWars;
import java.util.*;

public class PigLatin {
    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
//        String[] s = str.split(" ");
//        String ay = "ay";
//        for (int i = 0; i < s.length; i++) {
//            if (s[i].length() != 1) {
//                char[] charArr = s[i].toCharArray();
//                char sym = charArr[0];
//                charArr[0] = charArr[charArr.length - 1];
//                charArr[charArr.length - 1] = sym;
//                s[i] += sym;
//            }
//        }
//        for (int i = 0; i < s.length; i++) {
//            if (!(s[i].equals(".") || s[i].equals(",") || s[i].equals(":") || s[i].equals(";") ||
//                    s[i].equals("..") || s[i].equals("...") || s[i].equals("\\") || s[i].equals("(") ||
//                    s[i].equals(")") || s[i].equals("[") || s[i].equals("]") || s[i].equals("{") ||
//                    s[i].equals("}") || s[i].equals("!") || s[i].equals("?") || s[i].equals("@") ||
//                    s[i].equals("#") || s[i].equals("*"))) {
//                s[i] += ay;
//
//                String tempStr = s[i];
//                tempStr = tempStr.substring(1);
//                s[i] = tempStr;
//            }
//        }
//        return String.join(" ", s);
    }

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool !"));
        System.out.println(pigIt("This is my string"));
        System.out.println(pigIt("[O tempora o] mores !"));

    }
}
