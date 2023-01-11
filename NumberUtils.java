public class NumberUtils {
    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
        System.out.println(isNarcissistic(1634));
        System.out.println(isNarcissistic(112));
    }

    public static boolean isNarcissistic(int number) {
        String tempString = "" + number;
        int sum = 0;
        int tempInt = number;
        int degree = tempString.length();
        while (number > 0) {
            sum += Math.pow(number % 10, degree);
            number /= 10;
        }
        return sum == tempInt;
    }
}