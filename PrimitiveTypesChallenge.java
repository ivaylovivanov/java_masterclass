public class PrimitiveTypesChallenge {
    public static void main(String[] args){
        byte myByteVar = 1;
        short myShortVar = 2;
        int myIntVar = 3;

        long myLongVar = 50000L + 10L * (long)(myByteVar + myShortVar + myIntVar);
        System.out.println(myLongVar);
    }
}
