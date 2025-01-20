class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length())
        return false;
        int c=0;
        int []t=new int[2];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=goal.charAt(i))
            {
                
                if(c==2)
                return false;
                t[c]=i;
                c++;

            }
        }
         if (c == 0) {
            int[] freq = new int[26];
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
                if (freq[ch - 'a'] > 1) {
                    return true; // Duplicate character found
                }
            }
            return false; // No duplicates
        }

        if(
            s.charAt(t[0])==goal.charAt(t[1])&&
             s.charAt(t[1])==goal.charAt(t[0])
        )
        return true;
        return false;
    }
}