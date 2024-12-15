class Solution {
    public void moveZeroes(int[] nums) {
        int c=0,t=0;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]!=0)
           {
            t=nums[c];
            nums[c]=nums[i];
            nums[i]=t;
            c++;
           }
        }
        
    }
}