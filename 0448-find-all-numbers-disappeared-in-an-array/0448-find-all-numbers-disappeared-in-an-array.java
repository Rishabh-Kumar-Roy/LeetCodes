class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Boolean> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],true);
        }
            
        
        List<Integer> result=new ArrayList<>();
        for(int i=1;i<=nums.length;i++)
        {
            if(!hm.containsKey(i))
            result.add(i);
        }
        return result;
    }
}