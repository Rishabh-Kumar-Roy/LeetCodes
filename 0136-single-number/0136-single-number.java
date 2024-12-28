class Solution {
    public int singleNumber(int[] nums) {
       
        int l=nums.length;
        int d=0;
        for(int i=0;i<l;i++)
        {
            d^=nums[i];
        }
        return d;
    }
}