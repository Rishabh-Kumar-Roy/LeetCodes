class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer>s =new HashSet<>();
        Set<Integer>seen=new HashSet<>();
        int c=0;
        for(int n:nums)
        {
            if(s.contains(n-k))
            seen.add(n-k);
            if(s.contains(n+k))
            seen.add(n);
            s.add(n);
        }
        return seen.size();
    }
}