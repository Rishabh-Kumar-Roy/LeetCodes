class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=nums.length;
        for(int i=0;i<l-1;i++)
        {
            if(nums[i]==target)
            return i;
            if(nums[i]<target&& target<= nums[i+1])
            return i+1;
        }
        if(target>nums[l-1])
        return l;
        return 0;
    }
}