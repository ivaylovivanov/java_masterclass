public class FloatingPointPrecision {
    public static void main(String[] args) {
        int myIntValue = 5;
        float myFloatValue = 5;
        double myDoubleValue = 5;

        myIntValue = 5 /2;
        System.out.println(myIntValue);
        myFloatValue = 5f / 2f;
        System.out.println(myFloatValue);
        myDoubleValue = 5d / 2d;
        System.out.println(myDoubleValue);

        myIntValue = 5 / 3;
        System.out.println(myIntValue);
        myFloatValue = 5f / 3f;
        System.out.println(myFloatValue);
        myDoubleValue = 5d / 3d;
        System.out.println(myDoubleValue);

        myDoubleValue = 5.00 / 3.00;
        System.out.println(myDoubleValue);
        myDoubleValue = 5.00 / 3;
        System.out.println(myDoubleValue);
        myFloatValue = 5.00f / 3f;
        System.out.println(myFloatValue);

        double pounds = 200;
        double kilograms = pounds * 0.45359237;
        System.out.println("kilograms: " + kilograms);



    }
}
