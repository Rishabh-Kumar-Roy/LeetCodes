/*
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> hm1= new HashMap<>();
        HashMap<Character,Integer> hm2= new HashMap<>();
        for(char ch:s.toCharArray())
        {
            hm1.put(ch,hm1.getOrDefault(ch,0));
        }

        for(char ch:t.toCharArray())
        {
            hm2.put(ch,hm2.getOrDefault(ch,0));
        }
        if(s.length() != t.length())
        return false;
        int arr1[]=new int[s.length()];
        int arr2[]=new int[t.length()];
        int c=0;
        for(int i:hm1.values())
        {
            arr1[c]=i;
            c++;
        }
        c=0;
        for(int i:hm2.values())
        {
            arr2[c]=i;
            c++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[i])
            return false;
        }
        return true;




    }
}
*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        for(int i = 0; i < s.length(); i++) {
            if(mapS[s.charAt(i)] != mapT[t.charAt(i)]) return false;
            mapS[s.charAt(i)] = i + 1;
            mapT[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
