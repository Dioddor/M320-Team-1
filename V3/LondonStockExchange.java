import java.util.HashMap;
import java.util.Map;

public class LondonStockExchange implements StockExchange {
    private Map<String, Double> stockPrices;

    // Why: This constructor is used to define stock prices specific to the London market
    public LondonStockExchange() {
        stockPrices = new HashMap<>();
        stockPrices.put("Microsoft", 70.0); // Price is in GBP
        stockPrices.put("Apple", 95.0);
        stockPrices.put("Google", 130.0);
    }

    @Override
    public double getPrice(String stock) {
        // Why: Keeps the implementation consistent with the interface and supports decimals
        return stockPrices.getOrDefault(stock, 0.0);
    }
}
