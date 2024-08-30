public class CE22 {

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        int commonDivisor = 0;

        for (int i = 1; i <= first; i++) {
            if (first % i ==0 && second % i == 0) {
                commonDivisor = i;
            }
        }
        return commonDivisor;
    }
}
