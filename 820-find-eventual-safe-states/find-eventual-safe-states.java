class Solution 
{
    public List<Integer> eventualSafeNodes(int[][] graph) 
    {
        int n=graph.length;
        boolean visited[]=new boolean[n];
        boolean pathVisited[]=new boolean[n];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].length;j++)
                adj.get(i).add(graph[i][j]);
        }
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                dfs(i,adj,visited,pathVisited);
            }
        }
        List<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            if(!pathVisited[i])  res.add(i);
        return res;
    }
    boolean dfs(int start,List<List<Integer>> adj,boolean visited[],boolean pathVisited[])
    {
        visited[start]=true;
        pathVisited[start]=true;
        for(int it:adj.get(start))
        {
            if(!visited[it])
            {
                if(dfs(it,adj,visited,pathVisited))
                    return true;
            }
            else if(pathVisited[it])
                return true;
        }
        pathVisited[start]=false;
        return false;
    }
}