class Solution {
    public int minimumOperations(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        int ans=0;
        for(int i:nums)
        {
            arr.add(i);
        }
        while(true)
        {
            Set<Integer> s=new HashSet<>(arr);
            if(s.size()==arr.size())
            break;

            ans++;
            int c=Math.min(3,arr.size());
            for(int i=0;i<c;i++)
            {
                arr.remove(0);
            }
        }
        return ans;

    }
}