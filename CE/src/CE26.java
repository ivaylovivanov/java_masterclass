public class CE26 {

    public static int getLargestPrime(int number){

        if(number <= 1){
            return -1;
        }
        int largestPrime = 0;

        for(int i = 2; i <= number; i++){
            boolean isPrime = true;

            for (int divisor = 2; divisor <= i / 2; divisor++) {
                if (i % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime && number % i == 0) largestPrime = i;
        }

        return largestPrime;

    }
}
