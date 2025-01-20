package V2;

import java.util.Scanner;

// Main class providing a user interface to interact with the team.
// Why: Separates user interaction logic from core functionality  improving modularity and maintainability.
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Enables user input.
        Team team = new Team(); // Creates an empty team.

        // Why: Uses a loop to provide continuous interaction until the user chooses to exit.
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
            scanner.nextLine(); // Consumes leftover newline to prevent input issues.

            // Exit condition for the menu.
            // Why: Provides a clean way to end the program and release resources.
            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            // Handles creation of specific player roles based on user input.
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the player's name: ");
                String name = scanner.nextLine();

                Player player;
                // Why: Uses a switch statement to determine which subclass to instantiate  simplifying role assignment.
                switch (choice) {
                    case 1:
                        player = new Goalkeeper(name);
                        break;
                    case 2:
                        player = new Defender(name);
                        break;
                    case 3:
                        player = new Midfielder(name);
                        break;
                    case 4:
                        player = new Forward(name);
                        break;
                    default:
                        continue; // Invalid options are skipped safely.
                }

                team.addPlayer(player);
                // Why: Keeps team management logic encapsulated within the Team class  promoting clean separation of concerns.
            } else if (choice == 5) {
                team.displayTeam();
                // Why: Demonstrates the current state of the team and uses polymorphism to show player specific roles.
            } else {
                System.out.println("Invalid choice. Please try again.");
                // Why: Validates user input to ensure the menu operates as expected.
            }
        }

        scanner.close(); // Closes the scanner to free resources.
        // Why: Prevents resource leaks and ensures good programming hygiene.
    }
}
