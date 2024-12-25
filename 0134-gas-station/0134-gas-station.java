class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    int sumg=0,sumc=0,start=0,total=0;
    for(int i=0;i<gas.length;i++)
    {
        sumg+=gas[i];
        sumc+=cost[i];
        total+=gas[i]-cost[i];
        if(total<0)
        {
            start=i+1;
            total=0;
        }
    }
    if(sumg<sumc)
    return -1;
    return start;
    }
}