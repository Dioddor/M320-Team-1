import com.bookmanagement.model.Order;
import java.util.List;
import java.util.Optional;

/**
 * Repository interface for managing orders.
 */
public interface OrderRepository {
    void addOrder(Order order);
    Optional<Order> getOrderById(Long id);
    List<Order> getAllOrders();
    void updateOrder(Order order);
    void deleteOrder(Long id);
}
