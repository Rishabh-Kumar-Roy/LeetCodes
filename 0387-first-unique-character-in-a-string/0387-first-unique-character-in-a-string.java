class Solution {
    public int firstUniqChar(String s) {
        int l=s.length();
        int c=0;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(i!=j&&s.charAt(i)==s.charAt(j))
                {
                    c++;
                    break;
                }
                

            }
            if (c==0)
            return i;
             c=0;
        }
        return -1;
    }
}