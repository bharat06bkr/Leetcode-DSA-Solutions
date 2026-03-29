class Solution 
{
    public int findCircleNum(int[][] isConnected) 
    {
        int v=isConnected.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                    adj.get(i).add(j);
            }
        }
        int arr[]=new int[v];
        int count=0;
        for(int i=0;i<v;i++)
        {
            if(arr[i]==0)
            {
                count++;
                dfs(i,adj,arr);
            }
        }
        return count;
    }
    public static void dfs(int start,ArrayList<ArrayList<Integer>> adj,int []arr)
    {
        arr[start]=1;
        for(int i:adj.get(start))
            if(arr[i]==0)   dfs(i,adj,arr);
    }
}