class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) 
    {
        // I will do this problem in two ways 
        // detecting a cycle using dfs
        // detecting a cycle using kanh's algorithm || Topo sort || bfs

        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++)
        {
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        boolean visited[]=new boolean[numCourses];
        boolean pathVisited[]=new boolean[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(!visited[i])
            {
                if(detectCycle(i,adj,visited,pathVisited))
                    return false;
            }
        }
        return true;
    }
    boolean detectCycle(int start,List<List<Integer>> adj,boolean visited[],boolean pathVisited[])
    {
        visited[start]=true;
        pathVisited[start]=true;
        for(int it:adj.get(start))
        {
            if(!visited[it])
            {
                if(detectCycle(it,adj,visited,pathVisited))
                    return true;
            }
            else if(pathVisited[it])
                return true;
        }
        pathVisited[start]=false;
        return false;
    }
}




























