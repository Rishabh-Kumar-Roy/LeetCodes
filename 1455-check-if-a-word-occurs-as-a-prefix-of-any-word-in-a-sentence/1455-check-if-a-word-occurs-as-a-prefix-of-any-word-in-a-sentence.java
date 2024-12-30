class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[]s=sentence.split(" ");
        int l=s.length;
        for(int i=0;i<l;i++)
        {
            if(s[i].startsWith(searchWord))
            return i+1;
        }
        return -1;
    }
}