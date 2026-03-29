class Solution 
{
    static boolean arr[][];
    public int numIslands(char[][] grid) 
    {
        arr=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1' && !arr[i][j])
                {
                    count++;
                    traversal(i,j,grid);
                }
            }
        }
        return count;
    }
    public static void traversal(int i,int j,char grid[][])
    {
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]=='0' || arr[i][j])   return;
        arr[i][j]=true;
        traversal(i-1,j,grid);
        traversal(i+1,j,grid);
        traversal(i,j-1,grid);
        traversal(i,j+1,grid);
    }
}