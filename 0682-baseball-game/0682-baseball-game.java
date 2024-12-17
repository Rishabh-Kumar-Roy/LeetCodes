class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arr=new ArrayList<>();
        for( String op:operations)
        {
            switch(op)
            {
                case "+":
                int sum=arr.get(arr.size()-1)+arr.get(arr.size()-2);
                arr.add(sum);
                break;

                case "C":
                arr.remove(arr.size()-1);
                break;

                case "D":
                arr.add(2*arr.get(arr.size()-1));
                break;

                default:
                arr.add(Integer.parseInt(op));
                break;
            }
        }
        int t=0;
        for(int sc:arr)
        {
            t+=sc;
        }

        return t;
}
}