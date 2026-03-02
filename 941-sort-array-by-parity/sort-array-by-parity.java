class Solution 
{
    public int[] sortArrayByParity(int[] nums) 
    {
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            if(nums[left]%2==0) left++;
            else if(nums[right]%2!=0)   right--;
            else swap(nums,left,right);
        }
        return nums;
    }
    public static void swap(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}