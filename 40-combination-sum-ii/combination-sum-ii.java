class Solution 
{
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
         meth(0,target,candidates,new ArrayList<>());
        return result;  
    }
    public void meth(int index,int target,int arr[],List<Integer> l)
    {
        if(target==0)
        {
            result.add(new ArrayList<>(l));
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(i>index && arr[i]==arr[i-1]) continue;
            if(arr[i]>target)   break;
            l.add(arr[i]);
            meth(i+1,target-arr[i],arr,l);
            l.remove(l.size()-1);
        }
    }
}