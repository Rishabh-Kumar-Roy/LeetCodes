class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        back(candidates,target,0,new ArrayList<>(),res);
        return res;
    }
    void back(int [] candidates,int target,int start ,List<Integer>temp,List<List<Integer>>res)
    {
        if(target==0)
        {
        res.add(new ArrayList<>(temp));
        return;
    }
    if(target<0)
    {
        return;
    }
    for(int i=start;i<candidates.length;i++)
    {
        temp.add(candidates[i]);
        back(candidates,target-candidates[i],i,temp,res);
        temp.remove(temp.size()-1);
    }
    }
}