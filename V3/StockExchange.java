public interface StockExchange {
    // Why: A double is used because stock prices often have decimal places, and we need this precision for calculations
    // Why: The interface ensures all stock markets use the same way to provide stock prices
    double getPrice(String stock);
}
