import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Why: Creates stock market objects so the user can choose from different markets
        StockExchange zurich = new ZurichStockExchange();
        StockExchange newYork = new NewYorkStockExchange();
        StockExchange london = new LondonStockExchange();

        // Why: Simple menu lets the user select the stock market they want to use
        System.out.println("Choose a stock market:");
        System.out.println("1. Zurich");
        System.out.println("2. New York");
        System.out.println("3. London");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Why: This clears the buffer to avoid input issues

        StockExchange selectedMarket;
        switch (choice) {
            case 1:
                selectedMarket = zurich;
                break;
            case 2:
                selectedMarket = newYork;
                break;
            case 3:
                selectedMarket = london;
                break;
            default:
                // Why: Defaults to Zurich to ensure the program continues if the input is invalid
                System.out.println("Invalid choice. Defaulting to Zurich.");
                selectedMarket = zurich;
        }

        // Why: Passes the selected stock market to the portfolio so it knows where to get prices from
        Portfolio portfolio = new Portfolio(selectedMarket);

        // Why: Adds stocks to the portfolio to simulate a real-world investment scenario
        portfolio.addStock("Microsoft");
        portfolio.addStock("Apple");
        portfolio.addStock("Google");

        // Why: Displays the portfolio so the user can see the current prices and total value
        System.out.println("\nPortfolio Details:");
        portfolio.displayStocks();
        System.out.println("Total Portfolio Value: " + portfolio.calculateValue());

        scanner.close();
        // Why: Prevents resource leaks by closing the scanner after use
    }
}
