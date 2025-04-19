class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer>ar=new ArrayList<>();
        int j=0;
        int ar1[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            boolean flag=false;
            for(j=0;j<nums2.length;j++)
            { 
                if(flag &&nums1[i]<nums2[j])
                {
                    ar1[i]=nums2[j];
                    break;
                    
                }
                if(nums2[j]==nums1[i])
                flag=true;
            }
             if (j == nums2.length) 
                ar1[i] = -1;
        }
        
        return ar1;
    }
}