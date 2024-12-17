class Solution {
    public boolean isMonotonic(int[] nums) {
        int l=nums.length;
        if(l==1)
        return true;
        boolean inc=false,dec=false;
        for(int i=1;i<l;i++)
        {
            if(nums[i] > nums[i-1])
            inc=true;
            else if(nums[i] < nums[i-1])
            dec=true;

        }
        if(inc==true && dec==true)
        return false;

        return true;

    }
}