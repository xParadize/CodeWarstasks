/*

You are going to be given a word. Your job is to return the middle character of the word.
If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.

*/

class Kata {
  public static String getMiddle(String word) {
    int pos, len;
        if (word.length() % 2 == 1) {
            pos = word.length() / 2;
            len = 1;
        }
        else {
            pos = word.length() / 2 - 1;
            len = 2;
        }
        return word.substring(pos, pos + len);
  }
  public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("A"));
  }
}
