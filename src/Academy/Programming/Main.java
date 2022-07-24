package Academy.Programming;

public class Main {

    public static void main(String[] args){

        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = "+ myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue +1));

        int myMaxIntTest = 2_147_483_647;

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myByteMinValue);
        System.out.println("Byte Maximum value = " +myMaxByteValue);
        System.out.println("Test = " + myMaxIntTest);

        short myMinShortValue = Short.MIN_VALUE;

        long myLongValue = 100;
        long myMinLongValue= Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        int myTotal = (myMinIntValue/2);
        System.out.println(myTotal);

        byte myNewByteValue = (byte)  (myByteMinValue /2);
        short myNewShortValue = (short) (myMinShortValue /2);


        System.out.println("Challenge results");
         byte byteValue = 10;
         short shortValue = 20;
         int intValue = 50;
         long longTotal = 5000;


         long totalSum = 10*longTotal + byteValue + shortValue + intValue;
        System.out.println(totalSum);
        float myFloatValue = 5.25f;
        System.out.println(" Pounds to kilograms ");

        double kilo=200;
        double pounds= kilo*0.45359237;
        System.out.println(pounds);


        System.out.println("Char");

        char myChar = 'D';

    }
        }








