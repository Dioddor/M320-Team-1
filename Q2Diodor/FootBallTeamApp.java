package Q2Diodor;

import java.util.ArrayList;

/**
 * Base class defining common attributes and behavior for all player types.
 * <p>
 * Why: Ensures a consistent structure across all player roles, promoting code reuse 
 * and supporting polymorphism by allowing subclasses to override behavior.
 */
class Player {
    protected String name; 

    /**
     * Constructor to initialize the player's name.
     * 
     * @param name The name of the player.
     * What: Sets up the player's name upon instantiation.
     * Why: Enforces the requirement that every player must have a name, ensuring proper data initialization.
     */
    public Player(String name) {
        this.name = name; 
    }

    /**
     * Default play behavior for a player.
     * 
     * @return A message indicating the player's generic role in the game.
     * What: Provides a base implementation for a player's action in the game.
     * Why: Enables subclasses to override and define role-specific behavior, supporting polymorphism.
     */
    public String play() {
        return name + " is playing in the game.";
    }
}

/**
 * Represents a goalkeeper in the team.
 * <p>
 * Why: Provides specific behavior for goalkeepers, isolating their logic for maintainability and extensibility.
 */
class Goalkeeper extends Player {
    public Goalkeeper(String name) {
        super(name); 
    }

    @Override
    public String play() {
        return name + " is defending the goal!";
    }
}

/**
 * Represents a defender in the team.
 * <p>
 * Why: Defines unique responsibilities for defenders, adhering to the Open/Closed Principle.
 */
class Defender extends Player {
    public Defender(String name) {
        super(name);
    }

    @Override
    public String play() {
        return name + " is protecting the backline!";
    }
}

/**
 * Represents a midfielder in the team.
 * <p>
 * Why: Encapsulates midfielder-specific behavior, making the code more modular.
 */
class Midfielder extends Player {
    public Midfielder(String name) {
        super(name);
    }

    @Override
    public String play() {
        return name + " is controlling the midfield!";
    }
}

/**
 * Represents a forward in the team.
 * <p>
 * Why: Provides behavior specific to forwards, facilitating extensibility and role-specific actions.
 */
class Forward extends Player {
    public Forward(String name) {
        super(name);
    }

    @Override
    public String play() {
        return name + " is attacking and trying to score goals!";
    }
}

/**
 * Manages the team of players.
 * <p>
 * Why: Encapsulates team-related functionality, adhering to the Single Responsibility Principle 
 * and centralizing player management logic.
 */
class Team {
    private ArrayList<Player> players; 

    /**
     * Constructor to initialize the team.
     * What: Creates an empty list to store players.
     * Why: Ensures the team starts in a valid state and avoids potential null pointer issues.
     */
    public Team() {
        players = new ArrayList<>();
    }

    /**
     * Adds a player to the team.
     * 
     * @param player The player to be added.
     * What: Appends the given player to the team's list.
     * Why: Provides a controlled way to manage the team's roster.
     */
    public void addPlayer(Player player) {
        players.add(player);
        System.out.println(player.name + " has been added to the team!");
    }

    /**
     * Displays the players in the team and their roles.
     * What: Iterates through the team's players and invokes their respective play methods.
     * Why: Demonstrates polymorphism by calling the overridden methods for each player's role.
     */
    public void displayTeam() {
        System.out.println("Team Players:");
        for (Player player : players) {
            System.out.println("  " + player.name + ": " + player.play());
        }
    }
}