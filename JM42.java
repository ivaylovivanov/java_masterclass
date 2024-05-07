public class JM42 {
    public static void main(String[] args) {
        int myVar = 50;
        myVar++;
        myVar--;
        System.out.println("This is a test");
        System.out.println("This is a line " +
                "this is another " +
                "this is a third.");

        int anotherVar = 50;
        myVar--;
        System.out.println("myVar = " + myVar);

        if (myVar == 0){
            System.out.println("It's now zero");
        }


    }
}
