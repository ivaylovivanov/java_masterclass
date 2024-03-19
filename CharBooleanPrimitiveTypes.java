public class CharBooleanPrimitiveTypes {
    public static void main(String[] args) {
        char myChar = 'D';
        System.out.println(myChar);

        char myUnicode = '\u0044';
        System.out.println(myUnicode);

        char mySimpleChar = '?';
        char myUnicodeChar = '\u003f';
        char myDecimalChar = 63;

        System.out.println("My values are: " + mySimpleChar + " - " + myUnicodeChar + " - " + myDecimalChar);

        boolean myTrueBooleanValue = true;
        System.out.println(myTrueBooleanValue);

        boolean myFalseBooleanValue = false;
        System.out.println(myFalseBooleanValue);

    }
}
