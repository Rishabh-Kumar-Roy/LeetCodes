class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) return 0;
        int c=1,m=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]==nums[i])
            continue;
            else if(nums[i+1]==nums[i]+1)
            c++;
            else
            c=1;
            m=Math.max(m,c);
        }
        return m;
    }
}