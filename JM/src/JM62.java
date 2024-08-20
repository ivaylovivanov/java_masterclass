public class JM62 {
    public static void main(String[] args) {
        int sum = sum3and5(100);
        System.out.println("The sum of all numbers between 1 and 100 that devide both to 3 and 5 is " + sum);
    }

    public static int sum3and5(int n) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
                System.out.println(i + " can be devided by both 3 and 5");
                if (count == 5) {
                    break;
                }
            }
        }

        return sum;
    }
}
