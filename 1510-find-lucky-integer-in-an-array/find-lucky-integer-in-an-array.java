class Solution 
{
    public int findLucky(int[] arr) 
    {
        // if(arr[0]==500)  return 500;
        // Map<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<arr.length;i++)
        //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        // int max=-1;
        // for(Map.Entry<Integer,Integer> e:map.entrySet())
        // {
        //     if(e.getValue()==e.getKey())
        //         max=Math.max(max,e.getKey());
        // }  
        // return max;  
        int ans=-1;
        int freq[]=new int[501];
        for(int num:arr)
            freq[num]++;
        for(int i=1;i<=500;i++)
            if(freq[i]==i)  ans=i;
        return ans;
    }
}