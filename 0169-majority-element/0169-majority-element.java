class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: hm.entrySet
        ())
        {
            if(entry.getValue()>l/2)
            return entry.getKey();
        }
        return -1;
    }
}