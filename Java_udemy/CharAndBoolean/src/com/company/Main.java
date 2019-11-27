package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';//2 Bytes = 16 bits
        char myUnicode = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicode);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
