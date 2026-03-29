class Solution 
{
    int res;
    int count;
    public int maxAreaOfIsland(int[][] grid) 
    {
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
                if(grid[i][j]==1)    
                {
                    count=0;
                    traversal(i,j,grid);                    
                    res=Math.max(res,count);
                }
                
        }
        return res;
    }
    public void traversal(int i,int j,int grid[][])
    {
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]==0) return;
        grid[i][j]=0;
        count++;
        traversal(i-1,j,grid);
        traversal(i+1,j,grid);
        traversal(i,j-1,grid);
        traversal(i,j+1,grid);
    }
}