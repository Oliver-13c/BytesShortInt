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

        byte miMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + miMinByteValue);
        System.out.println("Byte Maximum value = " +myMaxByteValue);
    }
}
