public class CE24 {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        } else {
            int tempNumber = reverse(number);
            int tempCount = 0;
            while(tempNumber > 0){
                int temp = tempNumber % 10;

                switch (temp) {
                    case 0 -> System.out.print("Zero ");
                    case 1 -> System.out.print("One ");
                    case 2 -> System.out.print("Two ");
                    case 3 -> System.out.print("Three ");
                    case 4 -> System.out.print("Four ");
                    case 5 -> System.out.print("Five ");
                    case 6 -> System.out.print("Six ");
                    case 7 -> System.out.print("Seven ");
                    case 8 -> System.out.print("Eight ");
                    case 9 -> System.out.print("Nine ");
                    default -> System.out.print("Invalid Value");
                }
                tempNumber = tempNumber / 10;
                tempCount++;
            }

            for (int i = 0; i < getDigitCount(number) - tempCount; i++) {
                System.out.print("Zero ");
            }

        }
    }

    //return a number reversed to the one provided
    public static int reverse(int number){
        int tempNumber = number;
        if(tempNumber < 0){
            tempNumber *= -1;
        }
        int newNumber = 0;
        while (tempNumber > 0){
            int temp = tempNumber%10;
            tempNumber = tempNumber/10;
            newNumber = newNumber*10 + temp;
        }

        return number<0 ? newNumber*-1 : newNumber;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }

        if(number == 0){
            return 1;
        }

        int digitCount = 0;
        while(number > 0){
            digitCount++;
            number /= 10;
        }

        return digitCount;
    }
}
