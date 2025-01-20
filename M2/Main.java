package M2;

public class Main {
    public static void main(String[] args) {
        // Create handlers
        // Why: Each handler is responsible for a specific type of email, ensuring modular and focused processing
        AbstractEmailHandler salesHandler = new SalesEmailHandler();
        AbstractEmailHandler generalHandler = new GeneralHandler();

        // Link handlers in a chain
        // Why: This structure allows emails to pass through multiple handlers in a predefined order
        salesHandler.setNextHandler(generalHandler);

        // Process the first email
        String email = "This is an inquiry about sales";
        salesHandler.handle(email);
        // Why: Demonstrates handling a specific case where the email matches the criteria for a handler

        // Process the second email
        String email2 = "This is an inquiry about your opening hours";
        salesHandler.handle(email2);
        // Why: Ensures that the chain can handle different emails and route them to the appropriate handler
    }
}
