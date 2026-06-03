class Solution 
{
    public int rob(int[] nums) 
    {
        if(nums.length==1) return nums[0];
        int num1[]=new int[nums.length-1];
        int num2[]=new int[nums.length-1];
        int ind1=0;
        int ind2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0) num1[ind1++]=nums[i];
            if(i!=nums.length-1) num2[ind2++]=nums[i];  
        }
        // not picking first element in one array
        // not picking last element in one array
        // System.out.println(Arrays.toString(num1)+"  "+Arrays.toString(num2));
        return Math.max(rob2(num1),rob2(num2));
    }
    public int rob2(int[] arr) 
    {
         if(arr.length==0)   return 0;
        int prev=arr[0];
        int prev2=0;
        for(int i=1;i<arr.length;i++)
        {
            int pick=arr[i];
            if(i>1)  pick+=prev2;
            int notPick=0+prev;
            int curr=Math.max(pick,notPick);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}