package M2;

// Concrete handler for general inquiries
// Why: Acts as a fallback handler to ensure every email is processed, even if it does not match specific criteria
public class GeneralHandler extends AbstractEmailHandler {
    @Override
    public void handle(String email) {
        System.out.println("Email passed to General Department");
        // Why: Provides default processing for emails that no other handler in the chain can handle
    }
}
