class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0,r=nums.length,mid=0,ans=-1,ans1=-1,c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target&&c==0)
            {
                ans=i;
                c++;
            }
           
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
            ans1=i;
            break;
        }
        }
        return new int[]{ans,ans1};
    }
}