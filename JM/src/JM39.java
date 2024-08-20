public class JM39 {
    public static void main(String[] args) {
        double myDoubleVar = 20.00d;
        double mySecondDoubleVar = 80.00d;
        double result = (myDoubleVar + mySecondDoubleVar) * 100.00d;
        System.out.println("My result value is " +  result);

        double remainderResult = result % 40.00d;
        System.out.println("The remainder of the modulus is " + remainderResult);

        boolean isEven = remainderResult == 0.00d;
        System.out.println(isEven);

        if (!isEven){
            System.out.println("got some remainder");
        }
    }
}
