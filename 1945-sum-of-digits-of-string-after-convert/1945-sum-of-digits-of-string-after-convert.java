class Solution {
    public int getLucky(String s, int k) {
        //int ans=0;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            sb.append((c-'a')+1);
        }
        String nums=sb.toString();
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum=0;
            for(char ch:nums.toCharArray())
            {
                sum+=ch-'0';
            }
            nums=String.valueOf(sum);
        }
        return sum;
    }
}