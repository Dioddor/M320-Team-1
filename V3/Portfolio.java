import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<String> stocks; // List to hold stock names added to the portfolio
    private StockExchange stockExchange; // The stock market to be used for price lookups

    // Why: The constructor allows us to set which stock market the portfolio should use
    // Why: This setup makes the portfolio flexible since it can work with any stock market
    public Portfolio(StockExchange stockExchange) {
        this.stocks = new ArrayList<>();
        this.stockExchange = stockExchange;
    }

    // Why: Allows the user to add stocks to their portfolio one by one
    public void addStock(String stock) {
        stocks.add(stock);
    }

    // Why: Calculates the total value of the portfolio by adding up the prices of all the stocks
    // Why: Double is used for accurate calculations involving decimal values
    public double calculateValue() {
        double totalValue = 0.0;
        for (String stock : stocks) {
            totalValue += stockExchange.getPrice(stock);
        }
        return totalValue;
    }

    // Why: Shows the user all the stocks in their portfolio with the current prices
    public void displayStocks() {
        System.out.println("Stocks in Portfolio:");
        for (String stock : stocks) {
            System.out.println(stock + " - " + stockExchange.getPrice(stock));
        }
    }
}
