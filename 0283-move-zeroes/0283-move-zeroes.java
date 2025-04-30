class Solution {
    public void moveZeroes(int[] nums) {
        int t=0,c=0;
        int l=nums.length;
        for(int i=0;i<l;i++)
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