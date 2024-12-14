class Solution {
    public int fib(int n) {
        if(n==0)
        return 0;
        int ft=0;
        int st=1;
        int temp=0;
        for(int i=2;i<=n;i++)
        {
            temp=st;
            st=ft+st;
            ft=temp;
            
        }
        return st;
    }
}