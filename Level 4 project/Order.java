import java.util.Date;

/**
 * Represents an order in the book management system.
 */
public class Order {
    private Long id;
    private Long userId;
    private Long bookId;
    private Date orderDate;
    private String status;

    /**
     * Constructor for creating a new order.
     *
     * @param id        the unique identifier of the order
     * @param userId    the ID of the user placing the order
     * @param bookId    the ID of the book being ordered
     * @param orderDate the date the order was placed
     * @param status    the status of the order (e.g., pending, completed)
     */
    public Order(Long id, Long userId, Long bookId, Date orderDate, String status) {
        this.id = id;
        this.userId = userId;
        this.bookId = bookId;
        this.orderDate = orderDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", orderDate=" + orderDate +
                ", status='" + status + '\'' +
                '}';
    }
}