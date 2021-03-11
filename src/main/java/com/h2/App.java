package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    /**
     * 2.1
     * Open App.java, which is located in the src/main/java/com/h2 directory. In App.java, you will find a method called
     * doubleTheNumber(). Currently, it returns -1 as the return value. Change this implementation so that it returns
     * two times the number parameter.
     */

    public static int doubleTheNumber(int number) {
        return number *2;
    }

    /** 2.2
     * Next, create a new method called add(). This method should be private, static, and should have a return
     * type of int. The method should take one parameter as its input. The parameter name should be numbers,
     *  and should be of type int[]. At this time, return -1 as the return value of the method.
     */
    private static int add(int [] numbers) {
        var sum = 0;

        /* 2.3
          For the implementation of add() method, replace return -1; from the last task with the following.
          Create a variable called sum, and initialize its value to 0. Then, using a for loop over numbers
          (or using a while loop), add every item in the numbers array to the sum variable. Finally, return sum.
          */

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
