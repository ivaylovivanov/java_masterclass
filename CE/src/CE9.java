public class CE9 {
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
