public class Main {
    public static void main(String[] args) {
        CE33Point first = new CE33Point(6, 5);
        CE33Point second = new CE33Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        CE33Point point = new CE33Point();
        System.out.println("distance()= " + point.distance());
    }
}