class Solution {
    public double average(int[] salary) {
        int l=salary.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        double total = 0;
        for(int i=0;i<l;i++)
        {
            if(salary[i]>max){
                max = salary[i];
            }
            if(salary[i]<min){
                min = salary[i];
            }
            total += salary[i];
        }
        return (total-min-max)/(l-2);
    }
}