import java.util.*;

public class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("\nConverts temperatures in Fahrenheit to Celsius\n");

    System.out.println("Enter temperature (in Fahrenheit): ");
    double fah_temp = input.nextDouble();

   System.out.printf("%.0f degrees Fahrenheit = %.1f degrees Celsius", fah_temp, convertToCelsius(fah_temp));
  
  }

  public static double convertToCelsius(double f) {
    return (f-32) * 5/9;
  }
  
}
