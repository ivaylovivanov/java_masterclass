public class CE17 {

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
