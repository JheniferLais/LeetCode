class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """

        min_price = prices[0]
        max_profit = 0

        for price in prices[1:]:
            if price < min_price:
                min_price = price
            elif price - min_price > max_profit:
                max_profit = price - min_price

        return max_profit



# Case 1
# Expected Output = 5
prices = [7,1,5,3,6,4]
print(Solution().maxProfit(prices))

# Case 2
# Expected Output = 0
prices = [7,6,4,3,1]
print(Solution().maxProfit(prices))