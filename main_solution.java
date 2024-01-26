// Practicum 7 (Fahrenheit to Celsius Program) Solution

// ----------------------------------------------------------
// This program will convert Fahrenheit to Celsius
// ----------------------------------------------------------
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    // init
    double fahren_temp;
    double celsius_temp;
    String output_line;
    Scanner input = new Scanner(System.in);
    
    // program greeting
    System.out.println(
      "\nConverts temperatures in Fahrenheit to Celsius\n");

    // prompt for input
    System.out.println("Enter temperature (in Fahrenheit): ");
    fahren_temp = input.nextDouble();

    // display results
    celsius_temp = convertToCelsius(fahren_temp);
    
    System.out.printf("%.1f" + " degrees Fahrenheit = " + 
                      "%.1f" + " degrees Celsius" + "\n",
                      fahren_temp, celsius_temp);
  }

  public static double convertToCelsius(double f) {
    return (f - 32) * 5/9.0;
  }
  
}
