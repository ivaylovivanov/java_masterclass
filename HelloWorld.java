public class HelloWorld {
    public static void main(String[] args) {
        short myMinShortValue = Short.MIN_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;
        byte myByteMinValue = Byte.MIN_VALUE;
        short firstShort = 1;
        int firstInt = 2;

        int myTotal = (myMinIntValue / 2);
        System.out.println(myTotal);

        byte myNewByteValue = (byte) (myByteMinValue / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println(myNewShortValue);
    }

}
