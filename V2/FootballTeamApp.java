package V2;

import java.util.ArrayList;
import java.util.Scanner;

// Base class defining common attributes and behavior for all player types.
// Why: Ensures a consistent structure across all player roles  promoting code reuse and supporting polymorphism.
class Player {
    protected String name; 

    // Constructor: Initializes the name attribute when a new player is created.
    // Why: Enforces the requirement that every player must have a name  ensuring proper data initialization.
    public Player(String name) {
        this.name = name; 
    }

    // Method designed to be overridden in subclasses.
    // Why: Enables role specific behavior through polymorphism  allowing different player types to define unique actions.
    public String play() {
        return name + " is playing in the game.";
    }
}

// Subclass for the goalkeeper role.
// Why: Each player role has unique behaviors  and separating them into subclasses aligns with the Open/Closed Principle  making the code extensible.
class Goalkeeper extends Player {
    public Goalkeeper(String name) {
        super(name); // Calls the parent class constructor to set the player's name.
        // Why: Avoids duplicating initialization logic while leveraging the base class structure.
    }

    @Override
    public String play() {
        return name + " is defending the goal!";
        // Why: Overrides the base method to provide behavior specific to goalkeepers.
    }
}

// Subclass for defenders.
// Why: Similar to Goalkeeper  this class isolates defender specific logic for maintainability and clarity.
class Defender extends Player {
    public Defender(String name) {
        super(name);
    }

    @Override
    public String play() {
        return name + " is protecting the backline!";
    }
}

// Subclass for midfielders.
class Midfielder extends Player {
    public Midfielder(String name) {
        super(name);
    }

    @Override
    public String play() {
        return name + " is controlling the midfield!";
    }
}

// Subclass for forwards.
class Forward extends Player {
    public Forward(String name) {
        super(name);
    }

    @Override
    public String play() {
        return name + " is attacking and trying to score goals!";
    }
}

// Class to manage the team of players.
// Why: Centralizes player management  ensuring adherence to the Single Responsibility Principle and simplifying the main program.
class Team {
    private ArrayList<Player> players; // Dynamic list to store players of different roles.

    // Constructor: Initializes the players list when the team is created.
    // Why: Ensures the team starts in a valid  empty state. Prevents null pointer issues by initializing the list upfront.
    public Team() {
        players = new ArrayList<>();
    }

    // Adds a player to the team.
    // Why: Provides controlled access to the team's player list  encapsulating the logic for adding players.
    public void addPlayer(Player player) {
        players.add(player);
        System.out.println(player.name + " has been added to the team!");
    }

    // Displays all players in the team along with their roles.
    // Why: Demonstrates polymorphism by invoking the play() method  which behaves differently based on the player's role (subclass implementation).
    public void displayTeam() {
        System.out.println("Team Players:");
        for (Player player : players) {
            System.out.println("  " + player.name + ": " + player.play());
        }
    }
}

// Main class providing a user interface to interact with the team.
// Why: Separates user interaction logic from core functionality  improving modularity and maintainability.
public class FootballTeamApp {
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
