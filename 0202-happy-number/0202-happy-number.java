class Solution {
    public boolean isHappy(int n) {
        int a=n,b,c=0;
        Set<Integer> s=new HashSet<>();
        while(n!=1&& !s.contains(n))
        {
            s.add(n);
            c=0;
            while(n>0)
            {
            b=n%10;
            c+=(int)Math.pow(b,2);
            n=n/10;
            }
            n=c;

        }
     
        return n==1;
    }
}