package com.gabriel;

public class SimpleArrays {
    public SimpleArrays() {
        // write your code here
//        int[] myIntArray = new int [10]; // assigned 10 elements to it
//        myIntArray [0] = 45;
//        myIntArray [1] = 476;
//        myIntArray [2] = 50;
        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        double[] myDoubleArray = new double[10];
        for (int i =0;i<myDoubleArray.length;i++){
            myDoubleArray[i] = i*5;
        }
        printDoubleArray(myDoubleArray);
        printIntArray(myIntArray);
        System.out.println(myIntArray[0]);
    }

    public void printIntArray(int[] array){
        for (int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public void printDoubleArray(double[] array){
        for (int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
