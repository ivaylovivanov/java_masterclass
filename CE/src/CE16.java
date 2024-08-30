public class CE16 {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int initialNumber = number;

        while (number != 0) {
            int lastDigit = number % 10;

            reverse = reverse*10 + lastDigit;

            number /= 10;
        }

        return reverse == initialNumber;
    }
}
