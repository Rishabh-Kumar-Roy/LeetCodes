class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        int min=0;
        if(l1>l2)
        min=l2;
        else
        min=l1;
        String t="";
        for(int i=0;i<min;i++)
        {
            t+=word1.charAt(i);
            t+=word2.charAt(i);
        }
        if(l1>l2)
        t+=word1.substring(min,l1);
        else
        t+=word2.substring(min,l2);
        return t;
    }
}