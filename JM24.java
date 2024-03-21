public class JM24 {
    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("My String is equal to: " + myString);

        myString = "I wish I had a \u00241,000,000";
        System.out.println(myString);

        String numberString = "200.55";
        numberString = numberString + "49.45";
        System.out.println(numberString + 30.30);


    }
}
