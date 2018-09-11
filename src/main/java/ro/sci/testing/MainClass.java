/**
 * This is the main class for the following packages:
 * 1) calculatemax;
 * 2) inputdatavalidation;
 * 3) temperature
 *
 * @author Cristian S.
 */
package ro.sci;

import java.util.InputMismatchException;
import java.util.Scanner;

import static ro.sci.testing.GetMaxNumber.getMax;
import static ro.sci.testing.Time.time;
import static ro.sci.testing.TemperatureConversion.temperature;

public class MainClass {
    public static void main(String[] args) {

        //  1. Calculate Max
        //     - Create a method getMax() with two integer (int) parameters, that returns maximal of the two numbers.
        //     - Write a program that reads three numbers from the console and prints the biggest of them.
        //     Use the getMax() method you just created.

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Please input three numbers to display the biggest: ");
        try {
            int nr1 = scanner.nextInt();
            int nr2 = scanner.nextInt();
            int nr3 = scanner.nextInt();

            // call method getMax() to calculate the max number:
            //   - between nr1 and nr2
            int biggestNumber = getMax(nr1, nr2);

            //   - between biggest number (from nr and nr 2) and nr3
            biggestNumber = getMax(biggestNumber, nr3);

            // print the result:
            System.out.println("The biggest number is: " + biggestNumber);
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("Please input an integer ");
        }


        //  2. Fahrenheit to Celsius Conversion
        //        - create a method that converts temperature from Fahrenheit to Celsius.
        //        - write a program that for a given (by the user) body temperature, measured in Fahrenheit degrees,
        //        outputs it in Celsius degrees, with the following message: "Your body temperature in Celsius degrees is X",
        //        where X is respectively the Celsius degrees. In addition if the measured temperature in Celsius is higher
        //        than 37 degrees, the program should warn the user that they are ill, with the following message
        //        "You are ill!". ( use the method created before)

        System.out.println("2. Please input your body temperature in Fahrenheit degrees: ");
        try {
            int fahrenheit = scanner.nextInt();

            // call the method temperature() to convert the degrees from F to C:
            int celsius = temperature(fahrenheit);

            // print the body temperature:
            System.out.println("Your body temperature in Celsius degrees is " + celsius + ".");

            // warn the user if body temperature is bigger than 37 Celsius degrees:
            if (celsius > 37) {
                System.out.println("Your are ill!");
            }
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("Cannot convert to celsius degrees");
        }


        //3. Input Data Validation
        //      - write a program that asks the user what time it is, by printing on the console "What time is it?".
        //      Then the user must enter two numbers – one for hours and one for minutes.
        //      If the input data represents a valid time, the program must output the message " The time is hh:mm now.",
        //      where hh respectively means the hours, and mm – the minutes. If the entered hours or minutes are not valid,
        //      the program must print the message " Incorrect time!".
        //      The validation must be implemented in a separate method.

        System.out.println("3. What time is it? ");
        System.out.println("hours: ");
        try {
            int hh = scanner.nextInt();
            System.out.println("minutes: ");
            int mm = scanner.nextInt();

            // call the method "time" and print the result:

            System.out.println(time(hh, mm));
        } catch (InputMismatchException e) {
            throw new InputMismatchException("This is not a valid number!");
        }

    }
}