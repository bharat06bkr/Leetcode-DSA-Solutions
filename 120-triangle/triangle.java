class Solution 
{
    public int minimumTotal(List<List<Integer>> triangle) 
    {
        int n=triangle.size();
        int dp[][]=new int[n][n];
        for(int j=0;j<n;j++)
            dp[n-1][j]=triangle.get(n-1).get(j);
        for(int i=n-2;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                int up=triangle.get(i).get(j)+dp[i+1][j];
                int diag=triangle.get(i).get(j)+dp[i+1][j+1];
                dp[i][j]=Math.min(up,diag);
            }
        }
        return dp[0][0];
    }


    /*
    mundhu recurrence relation dani nuchi malli ila so enti antee
    f(i,j)
    {
        if(i==n-1)  return a[i][j];
        if(dp[i][j]!=-1)
        {
            int down=a[i][j]+f(i+1,j);
            int diag=a[i][j]+f(i+1,j+1);
            dp[i][j]=Math.min(down,diag);
        }
        return dp[i][j];
    }
    */
}