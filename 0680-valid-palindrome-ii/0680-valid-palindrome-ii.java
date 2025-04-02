class Solution {
    public boolean validPalindrome(String s) {
        int l=s.length();
        int i=0;
        int j=l-1;
        
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            return (vp(s,i+1,j)||vp(s,i,j-1));
            i++;
            j--;
        }
        return true;
    }
    public boolean vp(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
}