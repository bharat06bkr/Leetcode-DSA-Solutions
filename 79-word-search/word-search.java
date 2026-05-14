class Solution 
{
    boolean found=false;
    public boolean exist(char[][] mat, String word) 
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==word.charAt(0))
                {
                    find(i,j,mat,0,word,new boolean[mat.length][mat[0].length]);
                    if(found)
                        return true;
                }
            }
        }
        return false;
    }
    public void find(int row,int col,char mat[][],int index,String word,boolean visited[][])
    {
        if(found)   
            return;
        if(index==word.length())
        {
            found=true;
            return;
        }
        if(row<0 || col<0 || row>=mat.length || col>=mat[0].length || mat[row][col]!=word.charAt(index) || visited[row][col])
            return;
        visited[row][col]=true;
        find(row-1,col,mat,index+1,word,visited);
        find(row+1,col,mat,index+1,word,visited);
        find(row,col-1,mat,index+1,word,visited);
        find(row,col+1,mat,index+1,word,visited);
        visited[row][col]=false;
    }
}