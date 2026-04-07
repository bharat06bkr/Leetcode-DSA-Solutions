class Solution 
{
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        backtrack(candidates,target,new ArrayList<>(),0);
        return res;
    }
    void backtrack(int arr[],int target,List<Integer> l,int start)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(l));
            return;
        }
        if(start>=arr.length || target<0)
            return ;
        l.add(arr[start]);
        backtrack(arr,target-arr[start],l,start);
        l.remove(l.size()-1);
        backtrack(arr,target,l,start+1);
    }
}