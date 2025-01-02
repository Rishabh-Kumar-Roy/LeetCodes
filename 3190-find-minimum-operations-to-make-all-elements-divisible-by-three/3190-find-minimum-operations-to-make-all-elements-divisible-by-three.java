class Solution {
    public int minimumOperations(int[] nums) {
        int l=nums.length;
        int c=0,t=0;
        for(int i=0;i<l;i++)
        {
            c=nums[i]%3;
            switch(c)
            {
                case 1:
                t++;
                break;
                case 2:
                t++;

                
            }
        }
        return t;
    }
}