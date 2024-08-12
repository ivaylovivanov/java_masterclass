public class JM65 {
    public static void main(String[] args) {
        int i = 0;
        int numOddNumbers = 0;
        int numEvenNumbers = 0;
        while (i < 20){
            if(isEvenNumber(i)) {
                System.out.println(i + " is" + (isEvenNumber(i) ? "" : " NOT") + " even number");
                numEvenNumbers++;
            } else {
                numOddNumbers++;
            }
            i++;

            if (numEvenNumbers >= 5){
                break;
            }
        }

        System.out.println("Number of even numbers: " + numEvenNumbers);
        System.out.println("Number of odd numbers: " + numOddNumbers);
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}
