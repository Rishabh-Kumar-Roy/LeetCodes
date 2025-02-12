class Solution {
    public int minimumChairs(String s) {
        int n=s.length();
        int count=0;
        int maxcount=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='E')
            {
            count++;
            maxcount=Math.max(maxcount,count);
            }
            else
            {
            count--;
            
            }

        }
        
        return maxcount;
    }
}