class Solution {
    public int maxSubArray(int[] nums) {
        
        int ans=nums[0];
        int s=0;
      
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            ans=Math.max(ans,s);
            if(s<0)
            s=0;

        }
        return ans;
    }
}