class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l=s.length();
        String s1="";
        for(int i=0;i<l;i++)
        {
            s1+=s.charAt(i);
            int l1=s1.length();
            for(int j=0;j<l;)
            {
                if(!s1.equals(s.substring(j,j+l1)))
                return false;
                j=j+l1;
            }
        }
        return true;
    }
}