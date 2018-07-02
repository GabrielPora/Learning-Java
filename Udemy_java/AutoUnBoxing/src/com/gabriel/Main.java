package com.gabriel;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Gabriel");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
            // Integer.valueOf(i) this is auto boxing
            // when we covert a primitive type to an object type
            // We are just wrapping it with an object class,
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " -> " + integerArrayList.get(i).intValue());
            // integerArrayList.get(i).intValue() is unboxing
            // when we taking it from the class and converting it back to a primitive type
        }

        Integer myIntValue = 56; // runs it as Integer myIntValue = Integer.valueOf(56);
        int myInt = myIntValue.intValue(); // myIntValue.intValue();

        ArrayList<Double> myDoubleArrayList = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10; dbl += 0.5) {
//            myDoubleArrayList.add(Double.valueOf(dbl));
            myDoubleArrayList.add(dbl);
        }
        for (int i = 0; i < myDoubleArrayList.size(); i++) {
//            double value = myDoubleArrayList.get(i).doubleValue();
            double value = myDoubleArrayList.get(i);
            System.out.println(i + " -> " + value);
        }

    }
}
