class Solution {
    public boolean judgeCircle(String moves) {
        int u=0,l=0;
        int len=moves.length();
        for(int i=0;i<len;i++)
        {
            if(moves.charAt(i)=='U')
            u++;
            if(moves.charAt(i)=='D')
            u--;
            if(moves.charAt(i)=='L')
            l++;
            if(moves.charAt(i)=='R')
            l--;
        }
        return u==0&&l==0;
    }
}