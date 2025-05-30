class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        
        int tar=(nums.length)/2;
        for(Integer i:hm.keySet())
        {
            if(hm.get(i)>tar)
            return i;
        }
        return -1;

    }
}