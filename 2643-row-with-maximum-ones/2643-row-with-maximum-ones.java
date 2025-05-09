class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int c=0,max=0,ans=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                c++;
            }
            if(c>max)
            {
            max=c;
            ans=i;
            }
            c=0;
        }
        int []ar1={ans,max};
        
        return ar1;
    }
}