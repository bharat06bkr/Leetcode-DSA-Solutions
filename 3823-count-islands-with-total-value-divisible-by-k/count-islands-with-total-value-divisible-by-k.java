class Solution 
{
    long sum;
    public int countIslands(int[][] grid, int k) 
    {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]>0)
                {
                    sum=0;
                    traversal(i,j,grid);
                    if(sum%k==0)    count++;
                }
            }
        }
        return count;    
    }
    public void traversal(int i,int j,int grid[][])
    {
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]==0)  return ;
        sum+=grid[i][j];
        grid[i][j]=0;
        traversal(i-1,j,grid);
        traversal(i+1,j,grid);
        traversal(i,j-1,grid);
        traversal(i,j+1,grid);
    }
}