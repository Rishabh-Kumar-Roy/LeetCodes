class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0;
        for(int t:hours)
        {
            if(t>=target)
            c++;
        }
        return c;
    }
}