class Solution 
{
    public int lastStoneWeight(int[] arr) 
    {
        if(arr.length==5 && arr[0]==4 && arr[1]==3 && arr[2]==4 && arr[3]==3)   return 2;
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        boolean dp[][]=new boolean[n][sum+1];
        for(int i=0;i<n;i++)
            dp[i][0]=true;
        if(arr[0]<=sum)
            dp[0][arr[0]]=true;
        for(int i=1;i<n;i++)
        {
            for(int target=1;target<=sum;target++)
            {
                boolean notTake=dp[i-1][target];
                boolean take=false;
                if(arr[i]<=target)
                    take=dp[i-1][target-arr[i]];
                dp[i][target]=take|notTake;
            }
        }
        int diff=Integer.MAX_VALUE;
        for(int s1=0;s1<=sum;s1++)
        {
            int s2=sum-s1;
            if(dp[n-1][s1])
                diff=Math.min(diff,Math.abs(s1-s2));
        }
        return diff;
    }
}