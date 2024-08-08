public class JM61 {
    public static void main(String[] args) {
        int primeNuCounter = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                primeNuCounter++;
                System.out.println( i + " is a prime number");
                if(primeNuCounter == 3){
                    System.out.println("Found 3 primes, exiting the look");
                    break;
                }
            }

        }
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return wholeNumber == 2;
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
