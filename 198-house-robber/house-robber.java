class Solution 
{
    public int rob(int[] arr) 
    {
        // int dp[]=new int[arr.length];
        // dp[0]=arr[0];
        // for(int i=1;i<arr.length;i++)
        // {
        //     int pick=arr[i];
        //     if(i>1) pick+=dp[i-2];
        //     int notPick=0+dp[i-1];
        //     dp[i]=Math.max(pick,notPick);
        // }
        // return dp[arr.length-1];

        // Best approach for space complexcity 
        int prev=arr[0];
        int prev2=0;
        for(int i=1;i<arr.length;i++)
        {
            int pick=arr[i];
            if(i>1) pick+=prev2;
            int notPick=0+prev;
            int curr=Math.max(pick,notPick);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}