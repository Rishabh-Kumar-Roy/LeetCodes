class Solution {
    public int searchInsert(int[] nums, int target) {
        int j=nums.length;
        int i=0;
        while(i<j)
        {
            int m=(i+j)/2;
            if(nums[m]< target)
            i=m+1;
            else
            j=m;
        }
        return i;
    }
}