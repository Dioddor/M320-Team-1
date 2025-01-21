import java.util.HashMap;
import java.util.Map;

public class ZurichStockExchange implements StockExchange {
    private Map<String, Double> stockPrices;

    // Why: This constructor sets up the stock prices for the Zurich market, so they are ready to be used
    // Why: A HashMap is used because it's fast and lets us quickly find the price of a stock by its name
    public ZurichStockExchange() {
        stockPrices = new HashMap<>();
        stockPrices.put("Microsoft", 90.0); // Price is in CHF
        stockPrices.put("Apple", 120.0);
        stockPrices.put("Google", 150.0);
    }

    @Override
    public double getPrice(String stock) {
        // Why: We use getOrDefault to avoid errors if someone asks for a stock that's not in our list
        // Why: Double is returned because stock prices can have decimal places
        return stockPrices.getOrDefault(stock, 0.0);
    }
}
