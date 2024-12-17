class Solution {
    public int maxProfit(int[] prices) {
        int mp=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i-1]<prices[i])
            mp+=prices[i]-prices[i-1];
        }
        return mp;
    }
}