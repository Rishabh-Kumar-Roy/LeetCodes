class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int max=0;
        int c=0;
        for(int i=0;i<k;i++)
        {
            sb.append(s.charAt(i));
             if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') 
                c++;
        }
        max=c;
        for(int i=k;i<n;i++)
        {
            if(sb.charAt(0)=='a'||sb.charAt(0)=='e'||sb.charAt(0)=='i'||sb.charAt(0)=='o'||sb.charAt(0)=='u')
                c--;
            sb.append(s.charAt(i));
            sb.deleteCharAt(0);
            
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                c++;
            
            max=Math.max(max,c);
            
        }
        return max;
    }
}