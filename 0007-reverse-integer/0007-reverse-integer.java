class Solution {
    public int reverse(int x) {
        String sb=new StringBuilder().append(Math.abs((long)x)).reverse().toString();
        try
        {
            return (x>0)?
            Integer.parseInt(sb)
            :
            Integer.parseInt(sb)*-1;
        }
        catch(NumberFormatException e)
        {
                return 0;
        }
    }
}