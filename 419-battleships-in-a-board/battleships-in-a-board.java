class Solution 
{
    public int countBattleships(char[][] board) 
    {
        int count=0;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='X')
                {
                    count++;
                    traversal(i,j,board);
                }
            }
        }
        return count;
    }
    public static void traversal(int i,int j,char board[][])
    {
        if(i>=board.length || j>=board[0].length || i<0 || j<0 || board[i][j]=='.') return;
        board[i][j]='.';
        traversal(i-1,j,board);
        traversal(i+1,j,board);
        traversal(i,j+1,board);
        traversal(i,j-1,board);
    }
}