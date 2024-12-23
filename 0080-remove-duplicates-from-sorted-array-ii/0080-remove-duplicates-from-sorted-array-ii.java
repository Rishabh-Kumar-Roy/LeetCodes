class Solution {
    public int removeDuplicates(int[] nums) {
         int l=nums.length;
         int c=1,k=1;

         for(int i=1;i<l;i++)
         {
            if(nums[i]==nums[i-1])
            c++;
            else
            c=1;

            if(c<=2)
            nums[k++]=nums[i];
         }
         return k;
         
    }
}