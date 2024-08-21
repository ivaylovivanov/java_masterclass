import java.util.Scanner;

public class JM73 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        Scanner newScanner = new Scanner(System.in);
        while (count < 5){
            System.out.print("Enter number " + (count+1) + ": ");
            try {
                int num = Integer.parseInt(newScanner.nextLine());
                sum += num;
                count++;
            } catch (NumberFormatException badUserData){
                System.out.println("Invalid data input. Please try again.");
            }
        }

        System.out.println("Sum: " + sum);
    }
}
