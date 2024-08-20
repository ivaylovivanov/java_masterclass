public class CE19 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 13));
        System.out.println(hasSharedDigit(21, 23));
    }

    public static boolean hasSharedDigit(int number1, int number2){
        if(number1 < 10 || number2 < 10){
            return false;
        }

        if(number1 > 99 || number2 > 99){
            return false;
        }

        while (number1 > 0){
            int tempNumber = number1 % 10;
            number1 = number1 / 10;
            int tempNumber2 = number2;
            while (tempNumber2 > 0){
                if(tempNumber == tempNumber2 % 10){
                    return true;
                }
                tempNumber2 = tempNumber2 / 10;
            }
        }

        return false;
    }
}
