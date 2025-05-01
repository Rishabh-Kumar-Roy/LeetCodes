class Solution {
    public boolean isSameAfterReversals(int num) {
        int n=num;
        int a=0,b=0;
        while(n>0)
        {
            a=n%10;
            b=(b*10)+a;
            n=n/10;
        }
        n=b;a=0;
        b=0;
        while(n>0)
        {
            a=n%10;
            b=(b*10)+a;
            n=n/10;
        }
        //System.out.println(b);
        return b==num;
    }
}