class Solution {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2)
        return false;
        int []sc=new int[26];
        int []tc=new int[26];
        for(int i=0;i<s.length();i++)
        {
            sc[s.charAt(i)-'a']++;
            tc[t.charAt(i)-'a']++;
        }
         for(int i=0;i<26;i++)
        {
            if(sc[i]!=tc[i])
            return false;
        }
        return true;
        
    }
}