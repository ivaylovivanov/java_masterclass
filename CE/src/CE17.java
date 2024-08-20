public class CE17 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252)); //4
        System.out.println(sumFirstAndLastDigit(257)); //9
        System.out.println(sumFirstAndLastDigit(0)); //0
        System.out.println(sumFirstAndLastDigit(5)); //10
        System.out.println(sumFirstAndLastDigit(-10)); //-1
    }

    public static int sumFirstAndLastDigit (int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int count = 0;

        while (number > 0) {
            if (count == 0){
                sum += number % 10;
                count++;
            }

            if (number/10 == 0){
                sum += number % 10;
            }

            number /= 10;
        }
        return sum;
    }
}
