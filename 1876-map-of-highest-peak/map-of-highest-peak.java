class Solution 
{
    public int[][] highestPeak(int[][] isWater) 
    {
        int [][]dist=new int[isWater.length][isWater[0].length];
        boolean [][]visited=new boolean[isWater.length][isWater[0].length];
        Queue<int []> q=new LinkedList<>();
        for(int i=0;i<isWater.length;i++)
        {
            for(int j=0;j<isWater[0].length;j++)
            {
                if(isWater[i][j]==1)  
                {
                    q.add(new int[]{i,j,0});
                    visited[i][j]=true;
                }  
            }
        }
        int row_dir[]={-1,0,1,0};
        int col_dir[]={0,-1,0,1};
        while(!q.isEmpty())
        {
           int curr[]=q.poll();
           int i=curr[0];
           int j=curr[1];
           int steps=curr[2];
           dist[i][j]=steps;
           for(int k=0;k<4;k++)
           {
                int row=i+row_dir[k];
                int col=j+col_dir[k];
                if(row>=0 && col>=0 && col<isWater[0].length && row<isWater.length && !visited[row][col])
                {
                    visited[row][col]=true;
                    q.add(new int[]{row,col,steps+1});
                }
           }
        }
        return dist;
    }
}