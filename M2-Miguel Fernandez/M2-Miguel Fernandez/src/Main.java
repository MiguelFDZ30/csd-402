// Miguel Fernandez
// Module 2
// 6-08-2025

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create objects for unplanned numbers
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // make a random number from 1 to 3
        int computer = rand.nextInt(3) + 1;

        // make the user select their choice
        System.out.println("Enter 1 Rock, 2 Paper, 3 Scissors:");
        int user = scanner.nextInt();

        // Show the selections
        System.out.println("Machine Selection " + computer);
        System.out.println("Your Selection: " + user);

        // Determine who wins
        if (user == computer) {
            System.out.println("Tie"); // Both Same
        } else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
            System.out.println("Congrats! you win"); // user win
        } else {
            System.out.println("Machine wins"); // Machine win
        }

        // Close scanner
        scanner.close();
    }
}
