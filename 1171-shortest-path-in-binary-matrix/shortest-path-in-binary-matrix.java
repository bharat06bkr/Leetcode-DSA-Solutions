class Solution 
{
    public int shortestPathBinaryMatrix(int[][] grid) 
    {
        if(grid[0][0]==1)   return -1;
        int n=grid.length;
        int dist[][]=new int[n][n];
        for(int[] d:dist)
        Arrays.fill(d,Integer.MAX_VALUE);
        int dir_rows[]= {-1,-1,-1,0,0,1,1,1};
        int dir_cols[]= {-1,0,1,-1,1,-1,0,1};
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(1,0,0));
        dist[0][0]=1;
        while(!q.isEmpty())
        {
            int wt=q.peek().wt;
            int r=q.peek().row;
            int c=q.peek().col;
            q.remove();
            for(int i=0;i<8;i++)
            {
                int row=dir_rows[i]+r;
                int col=dir_cols[i]+c;
                if(row<0 || col <0 || row>=n || col>=n || grid[row][col]==1)    continue;
                if(dist[row][col]==Integer.MAX_VALUE)
                {
                    q.add(new Pair(wt+1,row,col));
                    dist[row][col]=wt+1;
                }
            }
        }
        return dist[n-1][n-1]!=Integer.MAX_VALUE?dist[n-1][n-1]:-1;
    }
}

class Pair
{
    int wt;
    int row;
    int col;
    Pair(int wt,int row,int col)
    {
        this.wt=wt;
        this.row=row;
        this.col=col;
    }
}