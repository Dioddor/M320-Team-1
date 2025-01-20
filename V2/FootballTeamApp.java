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

