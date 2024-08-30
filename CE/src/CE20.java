public class CE20 {

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {
            int rightMostA = a % 10;
            int rightMostB = b % 10;
            int rightMostC = c % 10;

            return rightMostA == rightMostB || rightMostC == rightMostA || rightMostB == rightMostC;
        }

        return false;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
