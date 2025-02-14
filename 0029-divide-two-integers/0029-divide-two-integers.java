class Solution {
    public int divide(int dividend, int divisor) {
        double q=dividend/divisor;
        if(q>Integer.MAX_VALUE)
        return ((int)Math.pow(2,31))-1;
        if(q<Integer.MIN_VALUE)
        return (int)(Math.pow(-2,31));

        return (int)q;

    }
}