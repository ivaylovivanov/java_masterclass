import java.util.Scanner;

public class JM74 {
    public static void main(String[] args) {
        int minNumber = 999999999;
        int maxNumber = 0;
        boolean isValidNumber = true;
        Scanner input = new Scanner(System.in);

        while (isValidNumber){
            System.out.print("Enter a numberor any character to quit: ");
            try{

                int currentNumber = Integer.parseInt(input.nextLine());
                if (currentNumber > maxNumber){
                    maxNumber = currentNumber;
                }

                if (currentNumber < minNumber){
                    minNumber = currentNumber;
                }
            } catch (NumberFormatException nfe){
                isValidNumber = false;
            }
        }

        System.out.println("The maximum number is: " + maxNumber);
        System.out.println("The minimum number is: " + minNumber);
    }
}
