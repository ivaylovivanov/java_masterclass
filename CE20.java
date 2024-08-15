public class CE20 {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71)); //true
        System.out.println(hasSameLastDigit(23, 32, 42)); //true
        System.out.println(hasSameLastDigit(9, 99, 999)); //false
    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        if(isValid(a) && isValid(b) && isValid(c)){
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
