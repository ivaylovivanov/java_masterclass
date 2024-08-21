import java.util.Scanner;

public class CE28 {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        int sum = 0;
        double average = 0;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int counter = 0;
        while (flag){
            try{
                int number = Integer.parseInt(sc.nextLine());
                sum = sum + number;
                counter++;
            } catch (NumberFormatException nfe){
                flag = false;
            }
        }

        if (counter > 0){
             average = (double)sum / counter;
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
    }
}
