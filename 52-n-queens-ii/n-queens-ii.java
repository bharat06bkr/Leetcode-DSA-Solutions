class Solution 
{
    int count=0;
    public int totalNQueens(int n) 
    {
       // need to learn optimal version of it 
       char board[][]=new char[n][n];
        for(int i=0;i<n;i++)
            Arrays.fill(board[i],'.');
        generate(0,board,n);
        return count;
    }
    public void generate(int col,char board[][],int n)
    {
        if(col==n)
        {
            count++;
            return;
        }
        for(int row=0;row<n;row++)
        {
            if(isSafe(row,col,board))
            {
                board[row][col]='Q';
                generate(col+1,board,n);
                board[row][col]='.';
            }
        }
    }
    public boolean isSafe(int row,int col,char board[][])
    {
        //chceking left up diagonal ---> <\
        int duprow=row;
        int dupcol=col;
        while(row>=0 && col>=0)
        {
            if(board[row][col]=='Q')    
                return false;
            row--;
            col--;
        }
        row=duprow;
        col=dupcol;
        // checking left side ---> <-
        while(col>=0)
        {
            if(board[row][col]=='Q')
                return false;
            col--;
        }
        row=duprow;
        col=dupcol;
        //checking right down diagonal ---> </
        while(row<board.length && col>=0)
        {
            if(board[row][col]=='Q')
                return false;
            row++;
            col--;
        }
        return true;
    }
}