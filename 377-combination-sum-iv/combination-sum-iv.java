// class Solution 
// {
//     ArrayList<Integer> l;
//     int count;
//     public int combinationSum4(int[] nums, int target) 
//     {
//         l=new ArrayList<>();
//         count=0;
//         meth(nums,target);
//         return count;
//     }
//     public void meth(int nums[],int target)
//     {
//         if(0>target) return;
//         if(target==0)
//         {
//             count++;
//             return;
//         }
//         for(int i=0;i<nums.length;i++)
//         {
//             l.add(nums[i]);
//             meth(nums,target-nums[i]);
//             l.remove(l.size()-1);
//         }
//     }
// }

class Solution 
{
    public int combinationSum4(int[] nums, int target) 
    {
        int dp[] = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i <= target; i++)
        {
            for (int num : nums)
            {
                if (i - num >= 0)
                {
                    dp[i] += dp[i - num];
                }
            }
        }

        return dp[target];
    }
}