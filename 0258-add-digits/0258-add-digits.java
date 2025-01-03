class Solution {
    public int addDigits(int num) {
        int n=num;
        while(n>=10)
        {
        n=s(n);
        }
        return n;    
    }

    public static int s(int a)
    {
        int c=0;
        while(a>0)
        {
            int b=a%10;
            c+=b;
            a=a/10;
        }
        return c;
    }
}