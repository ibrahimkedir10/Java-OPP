package maps;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Double> stockPortfolio = new HashMap<>();

        // Adding values to the HashMap
        stockPortfolio.put("AAPL", 100.0);
        stockPortfolio.put("GOOGL", 50.0);
        stockPortfolio.put("MSFT", 75.0);

        // Retrieving values from the HashMap
        System.out.println("Number of shares of AAPL: " + stockPortfolio.get("AAPL"));
        System.out.println("Number of shares of GOOGL: " + stockPortfolio.get("GOOGL"));
        System.out.println("Number of shares of MSFT: " + stockPortfolio.get("MSFT"));

        // Handling null keys
        stockPortfolio.put(null, 25.0); // Adding a null key
        System.out.println("Number of shares of null key: " + stockPortfolio.get(null));

        // Checking dividend payments for fractional shares
        double dividendRate = 0.5; // Dummy dividend rate for demonstration
        for (String ticker : stockPortfolio.keySet()) {
            double shares = stockPortfolio.get(ticker);
            double dividend = shares * dividendRate;
            System.out.println("Dividend for " + ticker + ": $" + dividend);
        }
    }
}
