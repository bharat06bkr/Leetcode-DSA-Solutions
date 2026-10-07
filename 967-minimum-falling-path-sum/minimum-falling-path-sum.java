class Solution 
{
    public int minFallingPathSum(int[][] matrix) 
    {
        int minSum=Integer.MAX_VALUE;
        int n=matrix.length;
        int m=matrix[0].length;
        int dp[][]=new int[n][m];
        for(int j=0;j<m;j++)
            dp[0][j]=matrix[0][j];
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int up=matrix[i][j]+dp[i-1][j];
                int leftUp=Integer.MAX_VALUE;
                if((j-1)>=0)
                    leftUp=matrix[i][j]+dp[i-1][j-1];
                int rightUp=Integer.MAX_VALUE;
                if((j+1)<m)
                    rightUp=matrix[i][j]+dp[i-1][j+1];
                dp[i][j]=Math.min(up,Math.min(leftUp,rightUp));
            }
        }
        // for(int[] a:dp)
        //     System.out.println(Arrays.toString(a));
        for(int j=0;j<m;j++)
            minSum=Math.min(minSum,dp[n-1][j]);
        return minSum;
    }
}