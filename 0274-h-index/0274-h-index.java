class Solution {
    public int hIndex(int[] citations) {
        int l=citations.length;
        int hi=0;
        for(int h=0;h<=l;h++)
        {
            int count=0;
            for(int c:citations)
            {
                if(c>=h)
                count++;
            }
            if(count>=h)
            hi=h;
            else
            break;
        }
        return hi;

    }
}