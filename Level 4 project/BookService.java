import com.bookmanagement.model.Book;
import com.bookmanagement.repository.Repository;
import java.util.List;

/**
 * Service layer for managing book-related business logic.
 */
public class BookService {
    private final Repository repository;

    /**
     * Constructor for BookService.
     *
     * @param repository the repository instance for managing books
     */
    public BookService(Repository repository) {
        this.repository = repository;
    }

    /**
     * Adds a new book to the repository.
     *
     * @param book the book to be added
     */
    public void addBook(Book book) {
        repository.addBook(book);
    }

    /**
     * Retrieves a book by its ID.
     *
     * @param id the unique identifier of the book
     * @return the book if found
     * @throws IllegalArgumentException if the book is not found
     */
    public Book getBookById(Long id) {
        return repository.getBookById(id).orElseThrow(() ->
                new IllegalArgumentException("Book not found with ID: " + id));
    }

    /**
     * Retrieves all books from the repository.
     *
     * @return a list of all books
     */
    public List<Book> getAllBooks() {
        return repository.getAllBooks();
    }

    /**
     * Updates the details of an existing book.
     *
     * @param book the book with updated details
     */
    public void updateBook(Book book) {
        repository.updateBook(book);
    }

    /**
     * Deletes a book by its ID.
     *
     * @param id the unique identifier of the book to be deleted
     */
    public void deleteBook(Long id) {
        repository.deleteBook(id);
    }

    /**
     * Searches for books by their genre.
     *
     * @param genre the genre to filter books by
     * @return a list of books matching the genre
     */
    public List<Book> searchBooksByGenre(String genre) {
        return repository.getAllBooks().stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                .toList();
    }

    /**
     * Calculates the total price of all books in the repository.
     *
     * @return the total price of all books
     */
    public double calculateTotalPrice() {
        return repository.getAllBooks().stream()
                .mapToDouble(Book::getPrice)
                .sum();
    }
}