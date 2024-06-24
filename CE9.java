public class CE9 {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

    }
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (y < 0) {
            return -1.0;
        }
        if (x < 0) {
            return -1.0;
        }
        return x * y;
    }
}
