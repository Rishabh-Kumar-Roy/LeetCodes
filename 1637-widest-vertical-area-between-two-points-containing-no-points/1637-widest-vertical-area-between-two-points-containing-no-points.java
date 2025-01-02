class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int l=points.length;
        int d=0;
        int min=Integer.MAX_VALUE;
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<l;i++)
        {
            
            d=Math.max(d,points[i][0]-points[i-1][0]);
               
            
        }
        return d;
    }
}