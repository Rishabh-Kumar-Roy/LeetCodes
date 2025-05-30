class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int temp=nums.length/3;
        List<Integer> ar=new ArrayList<>();
        for(Integer i:hm.keySet())
        {
            if(hm.get(i)>temp)
            ar.add(i);
        }
        return ar;
    }
}