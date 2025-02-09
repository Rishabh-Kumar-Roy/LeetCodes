class Solution {
    public int maxOperations(int[] nums, int k) {
        //ArrayList<Integer>arr=new ArrayList<>();
        Arrays.sort(nums);
        int c=0;
        // for(int i:nums)
        // {
        //     arr.add(i);
        // }
        int l=0,r=nums.length-1,val=0;
        while(l<r)
        {
            val=nums[l]+nums[r];
            if(val==k)
            {
                c++;
                l++;
                r--;
            }
            
            else if(val>k)
            r--;
            else
            l++;

        }
        return c;
        
    }
}