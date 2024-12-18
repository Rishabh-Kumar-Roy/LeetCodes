class Solution {
    public boolean lemonadeChange(int[] bills) {
        int a=0,b=0,c=0;
        for(int i=0;i<bills.length;i++)
        {
            if(a<0||b<0||c<0)
            return false;
            if(bills[i]==5)
            a++;
            if(bills[i]==10)
            {
            b++;
            a--;
            }
            if(bills[i]==20)
            {
                if(b==0){
                    a-=3;
                }else{
                b--;
                a--;
                }
            c++;
            }

        }
        if(a<0||b<0||c<0)
        return false;
        return true;
    }
}