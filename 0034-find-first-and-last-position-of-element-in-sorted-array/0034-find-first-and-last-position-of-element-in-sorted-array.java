class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []ans=new int[2];
        boolean flag=false;
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            if(nums[i]==target&& flag==false)
            {
            ans[0]=i;
            flag=true;
            } 

        }
        if(flag==false)
        ans[0]=-1;
        flag=false;

        for(int i=l-1;i>=0;i--)
        {
            if(nums[i]==target&& flag==false)
            {
            ans[1]=i;
            flag=true;
            } 

        }
        if(flag==false)
        ans[1]=-1;


        return ans;





    }
}