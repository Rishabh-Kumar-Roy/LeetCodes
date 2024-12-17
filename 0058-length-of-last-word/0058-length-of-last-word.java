class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int c=0;
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            c++;
            else
            return c;
        }
        return c;
    }
}