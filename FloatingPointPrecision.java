public class FloatingPointPrecision {
    public static void main(String[] args) {
        int myIntValue;
        float myFloatValue;
        double myDoubleValue;

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

        double pounds = 200;
        double kilograms = pounds * 0.45359237;
        System.out.println("kilograms: " + kilograms);



    }
}
