class Solution {
    public int countDigits(int num) {
        int a=0,c=0,n=num;
        while(n>0)
        {
            a=n%10;
            if(num%a==0)
            c++;
            n=n/10;
        }
        return c;
    }
}