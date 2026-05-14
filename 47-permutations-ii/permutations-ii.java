class Solution 
{
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] arr) 
    {
        Arrays.sort(arr);
        permute(arr,new boolean[arr.length],new ArrayList<>());
        return result;
    }
    public void permute(int arr[],boolean visited[],List<Integer> l)
    {
        if(l.size()==arr.length)
        {
            result.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i>0 && arr[i]==arr[i-1] && !visited[i-1])    
                continue;
            if(!visited[i])
            {
                visited[i]=true;
                l.add(arr[i]);
                permute(arr,visited,l);
                l.remove(l.size()-1);
                visited[i]=false;
            }
        }
    }
}