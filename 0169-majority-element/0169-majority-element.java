class Solution {
    public int majorityElement(int[] nums) {
        int cand=0,c=0;
        for(int num:nums)
        {
            if(c==0)
            cand=num;

            c+=(cand==num)?1:-1;
        }
        return cand;
    }
}