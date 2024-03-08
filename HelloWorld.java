public class HelloWorld {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println(myMinIntValue);

        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Maximum value is " + myMaxIntValue);
        System.out.println("Integer Maximum value is " + Integer.MAX_VALUE);

        System.out.println("Integer value range is (" + myMinIntValue + " to " + myMaxIntValue + ")");

        System.out.println("Byte value range is (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");

        System.out.println("Short value range is (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");

        System.out.println("Long value range is (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");
        System.out.println("Long has a width of " + Long.SIZE);

        long myLongValue = 100;
        System.out.println(myLongValue);

        long bigLongLiteralValue = 2_247_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        System.out.println(bigShortLiteralValue);

    }

}
