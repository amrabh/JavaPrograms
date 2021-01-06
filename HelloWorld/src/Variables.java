public class Variables {
    public static void  main(String[] arg){
        /*
         * There are eight primitive types in Java
         * They are namely
         * Byte (byte)
         * Character (char)
         * Short (short)
         * Integer (int)  -2147483648  to 2147483647
         * Long (long)
         * Float (float)
         * Double (double)
         */

        /*
         * Primitive type Integer (int)
         */

        int myNumber = 5;            //integer - data type to represent whole number
        System.out.println(myNumber);

        int MyFirstNumber = (2+10)*(5-2);
        System.out.println(MyFirstNumber);

        int MySecondNumber = 10;
        int MyThirdNumber = 5;
        int FinalNumber = MyFirstNumber * MySecondNumber * MyThirdNumber;
        System.out.println(FinalNumber);

        int myLastNumber = FinalNumber - 1000;
        System.out.println(myLastNumber);

        // Range of integer

        System.out.println("************************ INTEGER ************************");
        int MyMinIntValue = Integer.MIN_VALUE;
        System.out.println("Integer Minimum Value is :" + MyMinIntValue);

        int MyMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Maximum Value is :" + MyMaxIntValue);
        System.out.println("Busted Max Integer Value is : " + (MyMaxIntValue+1));  //Causes data overflow
        System.out.println("Busted Min Integer Value is : " + (MyMinIntValue-1));  //Causes data overflow
        int MyMaxIntTestValue = 2147483647;
        int MyMaxIntTestValue2 = 2_147_483_647;
        System.out.println(MyMaxIntTestValue);
        System.out.println(MyMaxIntTestValue2);
        /* int MyMaxIntTestValue = 2147483648; gives an error! */
        System.out.println("********************************************************");

        /*
         * Primitive Type - Byte (byte)
         */
        System.out.println("  ");
        System.out.println("************************ Byte ************************");
        byte MyMinByteValue = Byte.MIN_VALUE;
        System.out.println("Byte Minimum Value is :" + MyMinByteValue);
        byte MyMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value is :" + MyMaxByteValue);
        System.out.println("********************************************************");

        /*
         * Primitive Type - Short (short)
         */
        System.out.println("  ");
        System.out.println("************************ Short ************************");
        short MyMinShortValue = Short.MIN_VALUE;
        System.out.println("Short Minimum Value is :" + MyMinShortValue);
        short MyMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value is :" + MyMaxShortValue);
        System.out.println("********************************************************");

        /*
         * Primitive Type - Long (long)
         */
        long MyLongValue = 100L;
        long MyLongValueTwo = 200L;
        System.out.println("MyLongValue : " + MyLongValue);
        System.out.println("MyLongValueTwo : " + MyLongValueTwo);

        System.out.println("  ");
        System.out.println("************************ Long ************************");
        long MyMinLongValue = Long.MIN_VALUE;
        System.out.println("Long Minimum Value is :" + MyMinLongValue);
        long MyMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value is :" + MyMaxLongValue);
        System.out.println("********************************************************");

        /*
         * Primitive Floating Point - Float(float)
         */

        System.out.println("  ");
        System.out.println("************************ Float ************************");
        float MyMinFloatValue = Float.MIN_VALUE;
        System.out.println("Float Minimum Value is :" + MyMinFloatValue);
        float MyMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value is :" + MyMaxFloatValue);
        System.out.println("********************************************************");

        /*
         * Primitive  Long Floating Point - Double(double)
         */

        System.out.println("  ");
        System.out.println("************************ Double ************************");
        double MyMinDoubleValue = Double.MIN_VALUE;
        System.out.println("Double Minimum Value is :" + MyMinDoubleValue);
        double MyMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Maximum Value is :" + MyMaxDoubleValue);
        System.out.println("********************************************************");


        /*
         * Primitive Character Data type - Character(char)
         * A char occupies 2 bytes of memory or 16 bits thus has a width of 16 bits
         * This is because it allows to store Unicode characters as well as single character
         */

        /*
         * Unicode is an international encoding standard for use with different languages and scripts
         * by which each letter, digit, or symbol is assigned a unique numeric value that applies
         * across different platforms and programs
         * https://unicode-table.com/en/
         */

        System.out.println("  ");
        System.out.println("************************ Char ************************");
        char MyChar = 'A';
        char MyUnicode = '\u0041';
        System.out.println("Normal Character :" + MyChar);
        System.out.println("Unicode : " + MyUnicode);
        char MyCopyRightChar = '\u00A9';
        System.out.println("Copy Right Symbol : " + MyCopyRightChar);
        System.out.println("********************************************************");

        /*
         * Primitive Boolean Data type - Boolean(bool)
         * A boolean value allows for two choices True or False, Yes or No , 0 or 1.
         * In Java terms we have a boolean primitive type and it can be set to two values only true or false.
         * They are actually pretty useful and used for conditional statements in programming.
         */


        System.out.println("  ");
        System.out.println("************************ Boolean ************************");
        boolean MyTrueBooleanValue = true;
        System.out.println("MyTrueBooleanValue  : " + MyTrueBooleanValue);
        boolean MyFalseBooleanValue = true;
        System.out.println("MyFalseBooleanValue  : " + MyFalseBooleanValue);
        System.out.println("*********************************************************");

        boolean isCustomerOverEighteen = true;
        System.out.println("isCustomerOverEighteen ? " + isCustomerOverEighteen);

    }
}
