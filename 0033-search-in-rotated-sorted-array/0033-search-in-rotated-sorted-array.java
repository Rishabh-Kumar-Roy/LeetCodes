class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=0,m=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            return i;
        }
        
        return -1;
    }
}