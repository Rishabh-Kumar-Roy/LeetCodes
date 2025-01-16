class Solution {
    public int subtractProductAndSum(int n) {
        int a=0,b=0,c=1;
        while(n>0)
        {
            b=n%10;
            a+=b;
            c*=b;
            n=n/10;
        }
        return c-a;
    }
}