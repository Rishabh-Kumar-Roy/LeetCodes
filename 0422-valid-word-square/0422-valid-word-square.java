class Solution {
    public boolean validWordSquare(List<String> words) {
        
        for(int i=0;i<words.size();i++)
        {
            String temp="";
            for(int j=0;j<words.size();j++)
            {
                if (i < words.get(j).length()) 
                temp+=words.get(j).charAt(i);
            }
            if(!temp.equals(words.get(i)))
            return false;
            //temp="";
        }
        return true;
    }
}