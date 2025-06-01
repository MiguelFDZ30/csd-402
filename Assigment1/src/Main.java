//Miguel Fernandez
//First Program
//6-1-2025
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Make the scanner object
        Scanner input = new Scanner(System.in);

        // Prompts for the data
        System.out.print("Enter the quantity of water in kg");
        double waterq = input.nextDouble();

        System.out.print("Enter the first temperature in Celsius");
        double firtsTemperature = input.nextDouble();

        System.out.print("Enter the final temperature in Celcius");
        double finalTemperature = input.nextDouble();

        // Calculate total energy
        double energy = waterq * (finalTemperature - firtsTemperature) * 4184;

        // Display the result
        System.out.println("energy needed " + energy + " Joules. ");

        // Close the Scanner
        input.close();
    }
}
