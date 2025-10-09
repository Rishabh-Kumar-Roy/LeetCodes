class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int l=strs[0].length();
        int m=strs[strs.length-1].length();

        int max= l<m? l:m;
        int x=0;
        for(int i=0;i<max;i++)
        {
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))
            x++;
            else
            break;
        }
        return strs[0].substring(0,x);
    }
}