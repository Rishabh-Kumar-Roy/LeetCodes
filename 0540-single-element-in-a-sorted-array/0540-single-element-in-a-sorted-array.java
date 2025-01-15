class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left=0;
        int right=1;
        int l=nums.length;
        if(l==1)
        return nums[0];
        while(left<nums.length-1)
        {
            if(nums[left]!=nums[right])
            return nums[left];

            left+=2;
            right+=2;
        }
        return nums[l-1];
    }
}