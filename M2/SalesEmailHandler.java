package M2;

// Concrete handler for sales-related emails
// Why: Specifically targets emails that match "sales" to ensure they are handled by the right department
public class SalesEmailHandler extends AbstractEmailHandler {
    @Override
    public void handle(String email) {
        if (email.toLowerCase().contains("sales")) {
            System.out.println("Email handled by Sales Department");
        } else if (nextHandler != null) {
            nextHandler.handle(email);
        }
        // Why: Passing the email to the next handler ensures that unhandled emails are not dropped
    }
}
