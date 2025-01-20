package M2;

// Abstract class for all email handlers
// Why: Provides a blueprint for handling emails in a flexible way so that new handlers can be added without changing existing code
public abstract class AbstractEmailHandler {
    protected AbstractEmailHandler nextHandler; // Reference to the next handler in the chain

    // Method to set the next handler
    // Why: Allows the creation of a sequence of handlers where each can pass the responsibility to the next one if needed
    public void setNextHandler(AbstractEmailHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Abstract method to handle the email
    // Why: Ensures every handler class provides its own logic for processing emails
    public abstract void handle(String email);
}
