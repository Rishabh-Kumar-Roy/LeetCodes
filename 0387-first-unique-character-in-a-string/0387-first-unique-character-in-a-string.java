class Solution {
    public int firstUniqChar(String s) {
        int l=s.length();
        int f[]=new int[26];
        for(int i=0;i<l;i++)
        {
            f[s.charAt(i)-'a']++;
        }

        for(int i=0;i<l;i++)
        {
            if(f[s.charAt(i)-'a']==1)
            return i;
        }
        return -1;
    }
}