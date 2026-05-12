class Solution 
{
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        meth(1,k,n,new ArrayList<>());
        return result;
    }
    public void meth(int num,int n,int target,List<Integer> l)
    {
        if(target<0 || l.size()>n)    return;
        if(target==0 && l.size()==n)
        {
            result.add(new ArrayList<>(l));
            return;
        }
        for(int i=num;i<=9;i++)
        {
            if(i>target)    
                break;
            l.add(i);
            meth(i+1,n,target-i,l);
            l.remove(l.size()-1);
        }
    }
}