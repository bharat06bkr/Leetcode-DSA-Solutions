class Solution 
{
    public int[][] updateMatrix(int[][] mat) 
    {
        int dist[][]=new int[mat.length][mat[0].length];
        boolean visited[][]=new boolean[mat.length][mat[0].length];
        Queue<int []> q=new LinkedList<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==0)
                {
                    visited[i][j]=true;
                    q.add(new int[]{i,j,0});
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
                if(row>=0 && row<mat.length && col>=0 && col<mat[0].length && !visited[row][col])
                {
                    visited[row][col]=true;
                    q.add(new int[]{row,col,steps+1});
                }
            }
        }
        return dist;
    }
}