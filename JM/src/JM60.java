public class JM60 {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println("counter: " + counter);
        }

        for (double rate = 2; rate <= 5; rate++) {
            System.out.println("10 000 USD on " + rate + "% interest becomes " + calculateInterest(10000.0, rate));
        }

        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interestAmount = calculateInterest(100.0, rate);
            if (interestAmount >= 8.5){
                break;
        }
            System.out.println(calculateInterest(100.0, rate));
        }

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
