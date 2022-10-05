package org.meicode.helloworld;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.print("Hello World!");

        int number = 5; //2^31 number
        System.out.println(number);

        long myLong = 5; //2^63 number
        System.out.println(myLong);

        double myDouble = 4.5; //More Space Required
        System.out.println(myDouble);

        float myFloat = (float) 4.5; //Smaller numbers available
        System.out.println(myFloat);

        char myChar = '\u00A9';
        System.out.println(myChar);

        String name = "Jacob";
        System.out.println(name);
    }
}
