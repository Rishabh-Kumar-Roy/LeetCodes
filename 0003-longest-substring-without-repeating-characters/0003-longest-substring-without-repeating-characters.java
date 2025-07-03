class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            String ch="";
            for(int j=i;j<s.length();j++)
            {
                char c=s.charAt(j);
                if(ch.contains(String.valueOf(c)))
                break;
                else
                ch+=c;
            }
            max=Math.max(max,ch.length());
        }
        return max;
    }
}