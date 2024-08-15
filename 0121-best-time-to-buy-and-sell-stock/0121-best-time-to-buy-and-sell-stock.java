/*O(n^2);
class Solution {
    public int maxProfit(int[] prices) {
        int s=prices.length;
        int []d=new int[s];
        int diff=0;
    
        for(int i=0;i<s;i++)
        {
            for(int j=i+1;j<s;j++)
            {
                diff=prices[j]-prices[i];
                d[i]=Math.max(diff,d[i]);

            }
        }
        Arrays.sort(d);
        return d[s-1];
        
    }
}
*/
class Solution {
    public int maxProfit(int[] prices) {

        int s=prices.length;
        int min=Integer.MAX_VALUE;
        int p=0;
        for(int i=0;i<s;i++)
        {
            if(prices[i]<min)
            min=prices[i];

            if(prices[i]-min>p)
            p=prices[i]-min;

        }
        return p;
    }
}