class Solution {
    public int maxProfit(int[] prices) {
        int minp=Integer.MAX_VALUE;
        int maxp=0;
        for(int p:prices)
        {
            if(p<minp)
            minp=p;
            else
            maxp= Math.max(maxp,p-minp);
        }
        return maxp;
    }

}