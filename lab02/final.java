import java.util.Scanner;

/**
   A program that reads in a temperature in degrees Fahenheit
      and converts it to the equivalent temperature in Celsius
      and also the equivalent temperature in Kelvin.
   For example, if the input is F = 68.0 degrees Fahrenheit,
      then the conversions should show that C = 20.0 degrees Celsius
      and K = 293.0 degrees Kelvin.
*/
public class lab
{
   public static void main (String[] args)
   {
      // Define constants

      double celsius;
      double kelvin;

      // Display prompt for temperature in degrees Farhenheit
      System.out.print("Please enter the temperature ");
      System.out.println("in degrees Farhenheit: ");

      // Read Fahrenheit temperature
      Scanner in = new Scanner(System.in);
      double fahrenheit = in.nextDouble();

      // Compute Celsius and Kelvin equivalents
      // Your work here
       
       celsius = (5/9.0)*(fahrenheit - 32.0);
       kelvin = celsius + 273.0;

      // Print out equivalents
      System.out.println(celsius);
      System.out.println(kelvin);
   }
}
