class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>s =new HashSet();
        for(int k:nums)
        {
            if(s.contains(k))
return true;
else
s.add(k);
        }
return false;
    }
}