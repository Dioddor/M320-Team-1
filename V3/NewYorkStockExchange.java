import java.util.HashMap;
import java.util.Map;

public class NewYorkStockExchange implements StockExchange {
    private Map<String, Double> stockPrices;

    // Why: The constructor initializes stock prices specific to New York so this market has its own prices
    public NewYorkStockExchange() {
        stockPrices = new HashMap<>();
        stockPrices.put("Microsoft", 80.0); // Price is in USD
        stockPrices.put("Apple", 100.0);
        stockPrices.put("Google", 140.0);
    }

    @Override
    public double getPrice(String stock) {
        // Why: Ensures we can handle unknown stocks without crashing and supports decimal prices
        return stockPrices.getOrDefault(stock, 0.0);
    }
}
