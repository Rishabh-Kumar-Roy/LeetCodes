class Solution {
    public int reverseDegree(String s) {
        int p=1,sm=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            p=(i+1)*('z'-ch+1);
            sm+=p;
        }
        return sm;
    }
}