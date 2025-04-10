package easy;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int min_prices = prices[0];
        int max_prices = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min_prices) {
                min_prices = prices[i];
            } else if (prices[i] - min_prices > max_prices) {
                max_prices = prices[i] - min_prices;
            }
        }
        return max_prices;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}