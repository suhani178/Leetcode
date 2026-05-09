class Solution {
    public int maxProfit(int[] prices) {
        int MaximumProfit = 0;
        int MinimumStockPrice = prices[0];

        for(int CurrentDay = 1 ; CurrentDay < prices.length; ++CurrentDay){
            int DailyProfit = prices[CurrentDay] - prices[CurrentDay - 1];
            MaximumProfit = MaximumProfit + Math.max(0, DailyProfit); 
        
        }
        return MaximumProfit;
        
    }
}