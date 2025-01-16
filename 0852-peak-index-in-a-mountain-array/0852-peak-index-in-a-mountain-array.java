class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=arr.length;
        int start=0,finall=l-1,mid;
        // if(l<=3)
        // return 
        // arr[1];
        while(start<finall)
        {
            mid=start+(finall-start)/2;
            if(arr[mid]<arr[mid+1])
            start=mid+1;
            else
            finall=mid;

            // if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1])
            // return arr[mid];
        }
        return start;
    }
}