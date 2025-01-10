class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=s.length();
        
        int count=0;
        int max=0;
        for(int i=0;i<l;i++)
        {

            String s1="";
            for(int j=i;j<l;j++)
            {
                char c=s.charAt(j);
                //s1=s.substring(i,j);
                if(s1.contains(String.valueOf(c)))
                break;
                s1+=c;
                //count++;
                max=Math.max(s1.length(),max);
            }
        }
        return max;
    }
}