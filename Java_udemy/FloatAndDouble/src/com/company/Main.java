package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;//32 bits
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;//64 bits
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3.00;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);//Single precision is slower that double
        System.out.println("MyDoubleValue = " + myDoubleValue);//Double precision is faster

        double convertPounds = 200d;
        double pound = 0.45359237d;
        double kilograms = (double) (convertPounds * pound);
        System.out.println(kilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
