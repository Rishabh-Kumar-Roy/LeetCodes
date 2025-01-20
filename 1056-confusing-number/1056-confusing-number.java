class Solution {
    public boolean confusingNumber(int n) {
        Map<Character,Character> hm=new HashMap<>();
        hm.put('0','0');
        hm.put('1', '1');
        hm.put('6', '9');
        hm.put('8', '8');
        hm.put('9', '6');
        String str=Integer.toString(n);
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray())
        {
            if(!hm.containsKey(ch))
            return false;

            sb.append(hm.get(ch));
        }
        sb.reverse();

        return Integer.parseInt(sb.toString())!=n;

    }
}