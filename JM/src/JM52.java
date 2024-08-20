public class JM52 {
    public static void main(String[] args) {
        System.out.println("5ft, 8 inc. = " + convertToCentimeters(5,8) + " centimeters");
        System.out.println("68 inches = " + convertToCentimeters(68) + " centimeters");
    }

    public static double convertToCentimeters(int hInches) {
        return (double)hInches * 2.54;
    }

    public static double convertToCentimeters(int feet, int hInches) {
        int totalInches = (feet * 12) + hInches;
        return convertToCentimeters(totalInches);
    }
}
