class Solution 
{
    public int[] sortArrayByParityII(int[] nums) 
    {
        // int left=0;
        // int right=nums.length-1;
        // while(left<right)
        // {
        //     if((left%2==0 && nums[left]%2==0) || (left%2!=0 && nums[left]%2!=0))    left++;
        //     else if((right%2!=0 && nums[right]%2!=0) || (right%2==0 && nums[right]%2==0)) right--;
        //     else  
        //     {
        //         swap(nums,left,right);
        //         left++;
        //         right--;
        //     }
        // }
        // return nums;
        int left=0;
        int right=1;
        int n=nums.length;
        while(left<n && right<n)
        {
            if(nums[left]%2==0) left+=2;
            else if(nums[right]%2==1)   right+=2;
            else
            {
                swap(nums,left,right);
                left+=2;
                right+=2;
            }
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