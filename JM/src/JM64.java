public class JM64 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//
//        int j = 1;
//        boolean isReady = true;
//
//        do {
//            System.out.println(j);
//            j++;
//            if (j == 10) {
//                isReady = false;
//            }
//        } while (isReady);


        int number = 0;
        while (number < 50){
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }
}
