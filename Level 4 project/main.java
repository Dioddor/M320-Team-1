import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main entry point for the Book Management application.
 * <p>
 * This class initializes and runs the Spring Boot application.
 * </p>
 */
@SpringBootApplication
public class BookManagementApplication {
    /**
     * The main method to start the Book Management application.
     *
     * @param args command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        SpringApplication.run(BookManagementApplication.class, args);
    }
}