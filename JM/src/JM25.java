public class JM25 {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;
        System.out.println(previousResult);

        result = result - 1;
        System.out.println(result);
        System.out.println(previousResult);

        char firstChar = 'A';
        char secondChar = 'B';
        System.out.println(firstChar + secondChar);
        System.out.println("" + firstChar + secondChar);

        result = 2;
        result = result * 2;
        System.out.println(result);

        result = result / 4;
        System.out.println(result);

        result = 3;
        result = result % 2;
        System.out.println(result);

    }
}
