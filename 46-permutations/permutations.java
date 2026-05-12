import java.util.Scanner;
import java.util.List;

class Solution 
{
    List<List<Integer>> result = new ArrayList<>(); 
    public List<List<Integer>> permute(int[] nums) 
    {
        //meth(0,nums);
        meth2(nums,new boolean[nums.length],new ArrayList<>());
        return result;
    }
    // Apporach using swap
    public void meth(int index,int arr[])
    {
        if(index==arr.length)
        {
            List<Integer> l=new ArrayList<>();
            for(int i:arr)
                l.add(i);
            result.add(new ArrayList<>(l));            
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            swap(i,index,arr);
            meth(index+1,arr);
            swap(i,index,arr);
        }
    }
    public void swap(int a,int b,int arr[])
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    // Apporach using visited
    public void meth2(int arr[],boolean visited[],List<Integer> l)
    {
        if(l.size()==arr.length)
        {
            result.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!visited[i])
            {
                visited[i]=true;
                l.add(arr[i]);
                meth2(arr,visited,l);
                l.remove(l.size()-1);
                visited[i]=false;
            }
        }
    }
}