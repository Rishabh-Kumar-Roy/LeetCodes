class Solution {
    public int maxSubArray(int[] nums) {
        int s=0;
        int m=Integer.MIN_VALUE;
        for(int i:nums)
        {
            s+=i;
            if(s<0)
            s=0;
            m=Math.max(m,s);
        }
        return m;
        
    }
}