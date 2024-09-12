package dev.lpa;

public class Main {
    public static void main(String[] args) {
        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first item of the array is " + integerArray[0]);
        System.out.println("second item of the array is " + integerArray[1]);
        System.out.println("Length of the array is " + integerArray.length);
        System.out.println("last array element is " + integerArray[integerArray.length - 1]);

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        myDoubleArray = new double[]{1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 1.10};

        System.out.println(myDoubleArray[2]);
    }
}
