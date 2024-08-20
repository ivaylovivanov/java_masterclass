public class CE16 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707)); // true
        System.out.println(isPalindrome(11212)); // false
    }

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
