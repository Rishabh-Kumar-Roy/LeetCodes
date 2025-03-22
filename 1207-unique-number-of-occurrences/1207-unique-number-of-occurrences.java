class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:arr)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        Set<Integer>s=new HashSet<>();
        for(int i:hm.values())
        {
            s.add(i);
        }
        
        return hm.size()==s.size();
    }
}