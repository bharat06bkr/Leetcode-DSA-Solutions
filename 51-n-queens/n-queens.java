class Solution 
{
    // Need to learn some optimal version of it 
    List<List<String>> result=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) 
    {
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++)
            Arrays.fill(board[i],'.');
        generate(0,board,n);
        return result;
    }
    public void generate(int col,char board[][],int n)
    {
        if(col==n)
        {
            List<String> l=new ArrayList<>();
            for(int i=0;i<n;i++)
                l.add(new String(board[i]));
            result.add(new ArrayList<>(l));
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