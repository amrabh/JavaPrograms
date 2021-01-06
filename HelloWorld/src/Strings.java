public class Strings {
    public static void  main(String[] arg){
        /*
         * The String is a data type in Java, which is not a primitive type
         * It is actually a Class, but it enjoys a bit of favoritism in Java
         * to make it easier to use than a regular class
         */

        /*
         * A String is a sequence of characters. A large number of characters.
         * Technically it is limited by memory MAX_VALUE of an int which is 2.14 Billion.
         * That is a lot of characters !
         * In the case of char it could contain a single character.
         */

        String myString = "This is a string";
        System.out.println("myString is equal to :" + myString);
        myString = myString + ", and this is more.";     // String concatenation
        System.out.println("myString is equal to :" + myString);
        myString = myString + " \u00A92021";
        System.out.println("myString is equal to :" + myString);

        String numberString = "250.55";
        numberString = numberString + "49.55";
        System.out.println("numberString is equal to :" + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt ;  //converts the MyInt to String and then concatenates
        System.out.println("lastString : " + lastString);

        double doubleNumber =  120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString : " + lastString);

        /*
         * Strings in Java are immutable, that is you cannot change the String after it is created
         * Instead what happens is a new String is created
         */

        /*
         * The code we used for appending  Strings is inefficient and not recommended
         * StringBuffer is used 
         */

    }
}

