class Solution {
    public boolean judgeCircle(String moves) {
        int u=0,l=0;
        int len=moves.length();
        for(char ch : moves.toCharArray())
        {
            if(ch=='U')
            u++;
            if(ch=='D')
            u--;
            if(ch=='L')
            l++;
            if(ch=='R')
            l--;
        }
        return u==0&&l==0;
    }
}