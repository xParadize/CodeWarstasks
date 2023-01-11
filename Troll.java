package CodeWars;
public class Troll {

    public static String disemvowel(String str) {
        str = str.replaceAll("a", "");
        str = str.replaceAll("e", "");
        str = str.replaceAll("i", "");
        str = str.replaceAll("u", "");
        str = str.replaceAll("o", "");
        str = str.replaceAll("A", "");
        str = str.replaceAll("E", "");
        str = str.replaceAll("I", "");
        str = str.replaceAll("U", "");
        str = str.replaceAll("O", "");
        return str;
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }
}

