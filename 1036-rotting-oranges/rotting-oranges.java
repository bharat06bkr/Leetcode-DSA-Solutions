class Solution 
{
    public int orangesRotting(int[][] grid) 
    {
        Queue<int[]> q=new LinkedList<>();
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        int cf=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new int[]{i,j,0});
                    visited[i][j]=true;
                }
                else if(grid[i][j]==1)
                    cf++;
            }
        }
        int time=0;
        int rows[]={-1,0,1,0};
        int cols[]={0,1,0,-1};
        int count=0;
        while(!q.isEmpty())
        {
            int arr[]=q.poll();
            int i=arr[0];
            int j=arr[1];
            int tm=arr[2];
            time=Math.max(tm,time);
            for(int k=0;k<4;k++)
            {
                int row=rows[k]+i;
                int col=cols[k]+j;
                if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && !visited[row][col] && grid[row][col]==1)
                {
                    visited[row][col]=true;
                    q.add(new int[]{row,col,tm+1});
                    count++;
                }
            }
        }
        return count!=cf?-1:time;
    }

}