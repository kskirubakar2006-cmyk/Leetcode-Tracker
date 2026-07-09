// Last updated: 09/07/2026, 15:09:05
class Solution {
    public int maxProfit(int[] prices) {
     
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int currentPrice : prices) {
            minPrice = Math.min(currentPrice, minPrice);
            maxProfit = Math.max(maxProfit, currentPrice - minPrice);
        }
        
        return maxProfit;
    }
}
        