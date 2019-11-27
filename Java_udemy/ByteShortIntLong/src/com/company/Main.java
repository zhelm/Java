package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;//32 bits
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Minimum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));//Overflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));//Underflow

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;//8 Bits
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " +  myMinByteValue);
        System.out.println("Byte Maximum Value = " +  myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;//16 Bits
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " +  myMinShortValue);
        System.out.println("Short Maximum Value = " +  myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;//16 Bits
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " +  myMinLongValue);
        System.out.println("Long Maximum Value = " +  myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_648L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        //Casting
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;

        long myLong = 50000L + 10L * (long) (myByte + myInt + myShort);
        System.out.println(myLong);

        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));


    }
}
