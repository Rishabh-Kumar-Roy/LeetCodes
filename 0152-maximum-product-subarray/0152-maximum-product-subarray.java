class Solution {
    public int maxProduct(int[] nums) {
        int s=nums.length;
        if (s == 0) return 0;
        int min=nums[0],max=nums[0],p=nums[0];
        int dp[]=new int[s];
        dp[0]=nums[0];
        for(int i=1;i<s;i++)
        {
            if(nums[i]<=0)
            {
            int t=max;
            max=min;
            min=t;
            }
            min=Math.min(nums[i],min*nums[i]);
            max=Math.max(nums[i],max*nums[i]);
            p=Math.max(p,max);
        }
        return p;

        
    }
}