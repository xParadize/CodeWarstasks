package CodeWars;
import java.util.*;


class Permutations {

    public static List<String> singlePermutations(String s) {
        List<String> letters = Arrays.asList(s.split(""));
        Set<String> tempList = new HashSet<>();
        for (int i = 0; i < Math.pow(s.length(), s.length()); i++) {
            StringBuilder shuffled = new StringBuilder();
            Collections.shuffle(letters);
            for (String letter : letters) {
                shuffled.append(letter);
            }
            tempList.add(String.valueOf(shuffled));
        }
        List finalList = new ArrayList<>(tempList);
        Collections.sort(finalList);
        return finalList;
    }

    public static void main(String[] args) {
        System.out.println(singlePermutations("a"));
        System.out.println(singlePermutations("aa"));
        System.out.println(singlePermutations("ab"));
        System.out.println(singlePermutations("aba"));
        System.out.println(singlePermutations("aabb"));
        System.out.println(singlePermutations("abcd"));
        System.out.println(singlePermutations("qpwore"));
    }
}
