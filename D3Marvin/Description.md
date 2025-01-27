## Application Description

The application processes incoming emails by delegating them to appropriate handlers using the **chain-of-responsibility design pattern**. It includes:

1. **AbstractEmailHandler**:
   - A base abstract class that defines the structure for email handlers and supports chaining.
   - Ensures that each handler provides its own logic for processing emails.

2. **Specific Handlers**:
   - `SalesEmailHandler`: Processes sales-related emails by targeting messages containing the word "sales."
   - `GeneralHandler`: Acts as a fallback to handle all other emails that don't match specific criteria.

3. **Main Application**:
   - Handlers are linked in a chain, allowing emails to flow through the chain until an appropriate handler processes them.
   - Demonstrates modular, focused, and reusable logic for email processing.

### Delegation
The application achieves delegation by separating user input (emails) and processing logic into distinct handler classes. This makes the system modular and easier to extend.

### Exception Handling
Custom exception handling can be integrated to manage invalid input, such as null or empty email strings, ensuring robustness and graceful error management.
