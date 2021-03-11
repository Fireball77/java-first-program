package com.h2;

import java.util.Map;
import java.util.Scanner;

/**
 * 2.4.
 * Create a new public class BestLoanRates (in a file called BestLoanRates.java located under the com.h2 package and
 * directory). At this time, the class implementation should be empty. Make sure that it is located under the right
 * package. You would know that your implementation is correct if the first line of BestLoanRates.java is package com.h2;.
 */

public class BestLoanRates {

    /** 2.7.
     * In order to provide the best rates to users, you need a way to map from the loan year to best rate available.

     Inside BestLoanRates.java, create a new variable called bestRates. This variable must be public, static, and
     final (so that it is immutable once it is created). The type of bestRates must be Map<Integer, Float>.
     You will need to import java.util.Map to use Map in this step. Initialize this variable using the Map.of()
     syntax so that the values can be provided right here.

     Add 3 key-value pairs. Add 1, 5.50f, 2, 3.45f, 3, 2.67f as the argument to Map.of(). This is a way of
     saying that for a loan of 1 year, the best rate is 5.50%, for 2 years the best rate is 3.45% and for 3 years the best rate is 2.67%.
     */

    public final static Map<Integer, Float> bestRates = Map.of(
            1, 5.50f,
            2, 3.45f,
            3, 2.67f
    );

    /**
     * 2.5. Inside BestLoanRates.java, add a new method called main(). This method must be public, static,
     * void (which means it returns nothing). The method must also takes one parameter.
     * The parameter type must be String[], and its name should be args. At this time, leave the body of the main() method empty.
     */
    public static void main( String[] args )  {
        /* 2.6.
          In the main() method, create a new variable called scanner of type Scanner.
          Initialize this variable by calling the Scanner constructor (new Scanner(...))
          and providing System.in as its argument (also known as the source of the Scanner).You will need to import
          java.util.Scanner.You will use the Scanner API to read user - input from the command - line.

          Next, print the statement "Enter your name" in the console using System.out.println().Then, create a
          new variable called name of type String.Initialize this variable using scanner.nextLine() method.The scanner.
          nextLine() blocks on the command -line until it receives the input from the user, followed by the user pressing
          the Enter key.The input that it receives will be set as the value of the name variable.

          Print this variable back to the console using System.out.println().The format of the statement should be
           "Hello", followed by space, followed by the value of the name variable.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Enter your name" );
        String  name = scanner.nextLine();
        System.out.println("Hello " + name);

        /* 2.10
          Navigate to the line in the main() method where you printed "Hello " with the user name.
          Right after that, print another line using System.out.println() that says "Enter the loan term (in years)".
          Then, call the nextInt() method on scanner variable. Save the value received into a new variable called
          loanTermInYears. The type of this variable must be int since scanner.nextInt() returns an int.

          Then, call the getRates() method and pass loanTermInYears as the argument. Save the received value
          into a variable called bestRate. The variable must be of type float since getRates() returns a value of type float.

          Now, if the value of bestRate is 0.0f, print "No available rates for term: " + loanTermInYears
          + " years" (using System.out.println()). Otherwise, print "Best Available Rate: " + getRates(loanTermInYears)
          + "%". Read more about the float comparisons in java at this Stack Overflow page on comparing floats.

          Finally, call the close() method on scanner.
         */

        System.out.println("Enter the loan term (in years)");
        int loanTermInYears = scanner.nextInt();
        float bestRate = getRates(loanTermInYears);
        if (bestRate == 0.0f) {
            System.out.println("No available rates for term: " + loanTermInYears + " years");
        } else {
            System.out.println("Best Available Rate: " + getRates(loanTermInYears) + "%");
        }

        scanner.close();
    }

    /**
     * 2.8.
     * Now, create a new method called getRates(). The purpose of this method is to return the best rate available
     * for the given loan term in years. This method must be public, static, and returns a float. The method takes
     * one parameter called loanTermInYears of type int. For now, return 0.0f.
     */
    public static float getRates(int loanTermInYears) {
/* 2.9.
  Replace the return 0.0f with the following logic - if the bestRates variable contains the entry for loanTermInYears
  variable, return the corresponding value as the return value from this method. You can use containsKey()
  that is available on Map type. Otherwise, return 0.0f as the return value.
 */
        if (bestRates.containsKey(loanTermInYears)) {
            return bestRates.get(loanTermInYears);
        }
        return 0.0f;
    }
}
