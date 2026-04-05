class Solution 
{
    public int numEnclaves(int[][] grid) 
    {
        Queue<int []> q=new LinkedList<>();
        boolean visited[][]=new boolean[grid.length][grid[0].length]; 
        int count=0;
        int a1[]={0,grid.length-1};
        int a2[]={0,grid[0].length-1};
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[a1[i]][j]==1 && !visited[a1[i]][j])
                {
                    q.add(new int[]{a1[i],j});
                    visited[a1[i]][j]=true;
                }
            }
        }
        for(int j=0;j<a2.length;j++)
        {
            for(int i=1;i<grid.length-1;i++)
            {
                if(grid[i][a2[j]]==1 && !visited[i][a2[j]])
                {
                    q.add(new int[]{i,a2[j]});
                    visited[i][a2[j]]=true;
                }
            }
        }
        int dir_row[]={-1,0,1,0};
        int dir_col[]={0,-1,0,1};
        while(!q.isEmpty())
        {
            int curr[]=q.poll();
            int i=curr[0];
            int j=curr[1];
            for(int k=0;k<4;k++)
            {
                int row=i+dir_row[k];
                int col=j+dir_col[k];
                if(row>=0 && col>=0 && row<grid.length && col<grid[0].length && !visited[row][col] && grid[row][col]==1)
                {
                    visited[row][col]=true;
                    q.add(new int[]{row,col});
                }
            }
        }
        for(int i=0;i<grid.length;i++)
        {
                for(int j=0;j<grid[0].length;j++)
                    if(!visited[i][j] && grid[i][j]==1)    count++;
        } 
        return count;   
    }
}