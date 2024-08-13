public class JM66 {
    public static void main(String[] args) {
        System.out.println(sumDIgits(1001));
        System.out.println(sumDIgits(125));
        System.out.println(sumDIgits(102));
        System.out.println(sumDIgits(-103));
    }

    public static int sumDIgits(int number) {
        int sum = 0;
        if (number <= 0) {
            return -1;
        }

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
