package dev.lpa;

import java.util.Arrays;

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

        int[] newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }

        for (int element : newArray) {
            System.out.println(element);
        }

        System.out.println();

        for(int element: newArray){
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;

        System.out.println(Arrays.toString(objectArray));

    }
}
