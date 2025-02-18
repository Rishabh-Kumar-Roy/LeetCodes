class Solution {
    public int longestOnes(int[] nums, int k) {
        int right=0,left=0,max=Integer.MIN_VALUE,zero=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            zero++;

            while(zero>k&& left<=i)
            {
                if(nums[left]==0)
                zero--;
                left++;
            }
            max = Math.max(max, i - left +1);


        }
        return max;
    }
}