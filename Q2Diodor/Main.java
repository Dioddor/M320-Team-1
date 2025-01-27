package Q2Diodor;

import java.util.Scanner;

/**
 * Main class providing a user interface for managing the football team.
 * <p>
 * Why: Separates user interaction logic from core functionality, improving modularity 
 * and ensuring the main program remains clear and concise.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Team team = new Team(); // Creates an empty team.

        // Provides a menu for interacting with the team.
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Goalkeeper");
            System.out.println("2. Add Defender");
            System.out.println("3. Add Midfielder");
            System.out.println("4. Add Forward");
            System.out.println("5. Display Team");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumes the leftover newline.

            // Exits the program if the user chooses option 6.
            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            // Handles the creation of players.
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the player's name: ");
                String name = scanner.nextLine();
            
                Player player = null; // Initialize the variable to avoid compilation errors.
            
                switch (choice) {
                    case 1 -> player = new Goalkeeper(name);
                    case 2 -> player = new Defender(name);
                    case 3 -> player = new Midfielder(name);
                    case 4 -> player = new Forward(name);
                    default -> System.out.println("Invalid choice."); // Handle invalid cases (if necessary).
                }
            
                if (player != null) { // Add the player only if a valid choice was made.
                    team.addPlayer(player);
                }
            }            
        }

        scanner.close(); // Closes the scanner to release resources.
    }
}
