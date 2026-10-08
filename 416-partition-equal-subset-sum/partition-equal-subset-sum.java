class Solution 
{
    public boolean canPartition(int[] nums) 
    {
        int sum=0;
        for(int num:nums)
            sum+=num;
        return sum%2==0?subsetSum(nums,sum/2):false;
    }
    public boolean subsetSum(int arr[],int sum)
    {
        int n=arr.length;
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
                dp[i][target]=notTake|take;
            }
        }
        return dp[n-1][sum];
    }
}