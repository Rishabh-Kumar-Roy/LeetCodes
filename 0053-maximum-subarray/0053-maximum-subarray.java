

import static java.lang.Math.max;

class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum=0,maxsum=Integer.MIN_VALUE;;
        for(int n:nums)
        {
            sum+=n;
            maxsum=Math.max(sum,maxsum);
            if(sum<0)
            sum=0;
        }
        return maxsum;
    }
}