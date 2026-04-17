class Solution 
{
    public int[] findOrder(int numCourses, int[][] prerequisites) 
    {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++)
        {
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int inDegree[]=new int[numCourses];
        for(int i=0;i<adj.size();i++)
        {
            for(int it:adj.get(i))
                inDegree[it]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(inDegree[i]==0)  q.add(i);
        }
        int res[]=new int[numCourses];
        int i=numCourses-1;
        while(!q.isEmpty())
        {
            int curr=q.poll();
            res[i--]=curr;
            for(int it:adj.get(curr))
            {
                inDegree[it]--;
                if(inDegree[it]==0) q.add(it);
            }
        }
        if(i!=-1)   return new int[]{};
        return res;
    }
}