class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int ml=0;
        for(int i=0;i<n;i++)
        {
            int[]arr=new int[26];
            for(int j=i;j<n;j++)
            {
                if(++arr[s.charAt(j)-'a']==3)
                break;
                ml=Math.max(ml,j-i+1);
            }
        }
        return ml;
    }
}