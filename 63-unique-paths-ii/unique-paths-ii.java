class Solution 
{
    public int uniquePathsWithObstacles(int[][] grid) 
    {
        if(grid[0][0]==1) return 0;
        int dp[][]=new int[grid.length][grid[0].length];
        for(int[] d:dp) 
            Arrays.fill(d,-1);
       // return meth(grid.length-1,grid[0].length-1,grid,dp);
       for(int i=0;i<grid.length;i++)
       {
           for(int j=0;j<grid[0].length;j++)
           {
               if(grid[i][j]==1)    dp[i][j]=0;
               else if(i==0 && j==0)    dp[i][j]=1;
               else
               {
                   int right=0;
                   int down=0;
                   if(i>0)  down=dp[i-1][j];
                   if(j>0)  right=dp[i][j-1];
                   dp[i][j]=right+down;
               }
           }
       }
       return dp[grid.length-1][grid[0].length-1];
    }
    public int meth(int i,int j,int grid[][],int dp[][])
    {
        if(i==0 && j==0)    return 1;
        if(i<0 || j<0 || grid[i][j]==1) return 0;
        if(dp[i][j]!=-1)    return dp[i][j];
        int left=meth(i,j-1,grid,dp);
        int up=meth(i-1,j,grid,dp);
        dp[i][j]=left+up;
        return dp[i][j];
    }
}