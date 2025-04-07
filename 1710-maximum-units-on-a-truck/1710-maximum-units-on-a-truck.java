class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int tot=0,tu=0;
        for(int []i:boxTypes)
        {
            int boxtochose=Math.min(truckSize,i[0]);
            tu+=boxtochose*i[1];
            truckSize-=boxtochose;
            if(truckSize==0)
            break;
        }
        return tu;
    }
}