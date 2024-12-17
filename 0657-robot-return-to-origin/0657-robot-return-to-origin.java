class Solution {
    public boolean judgeCircle(String moves) {
        int u=0,d=0,l=0,r=0;
        int len=moves.length();
        for(int i=0;i<len;i++)
        {
            if(moves.charAt(i)=='U')
            u++;
            if(moves.charAt(i)=='D')
            d++;
            if(moves.charAt(i)=='L')
            l++;
            if(moves.charAt(i)=='R')
            r++;
        }
        if(l-r==0 && u-d==0)
        return true;

        return false;
    }
}