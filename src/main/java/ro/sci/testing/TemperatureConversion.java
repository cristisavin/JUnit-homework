/**
 * this method converts the degrees from Fahrenheit to Celsius
 *
 * @author Cristian S.
 */

package ro.sci.testing;


public class TemperatureConversion {
    public static int temperature(int a) {
        // Fahrenheit to Celsius conversion formula:
        int b = (a - 32) * 5 / 9;
        return b;
    }
}
