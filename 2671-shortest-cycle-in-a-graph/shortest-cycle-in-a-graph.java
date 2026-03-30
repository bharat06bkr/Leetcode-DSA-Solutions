class Solution 
{
    int count;
    public int findShortestCycle(int n, int[][] edges) 
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<Integer>());
        for(int i=0;i<edges.length;i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }       
        int min=Integer.MAX_VALUE;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++)
           min=Math.min(min,detectCycle(i,adj,n));
        return min!=Integer.MAX_VALUE?min:-1;
    }
    public int detectCycle(int starting,ArrayList<ArrayList<Integer>> adj,int n)
    {
        int dist[]=new int[n];
        Arrays.fill(dist,-1);
        dist[starting]=0;
        Queue<int []> q=new LinkedList<>();
        q.add(new int[]{starting,-1});
        int min=Integer.MAX_VALUE;
        while(!q.isEmpty())
        {
            int curr[]=q.poll();
            int node=curr[0];
            int parent=curr[1];
            for(int adjacentNode:adj.get(node))
            {
                if(dist[adjacentNode]==-1)
                {
                    dist[adjacentNode]=dist[node]+1;
                    q.add(new int[]{adjacentNode,node});
                } 
                else if(adjacentNode!=parent)
                    min=Math.min(dist[node]+dist[adjacentNode]+1,min);
            }
        }
        return min;
    }
}