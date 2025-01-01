class Solution {
    public int titleToNumber(String columnTitle) {
        int l=columnTitle.length(),count=0;
        if(l==1)
        return columnTitle.charAt(0)-64;
       
        for(int i=0;i<l;i++)
        {
            char ch=columnTitle.charAt(i);
            count=count*26+(ch-'A'+1);
        }
        return count;
        
    }
}