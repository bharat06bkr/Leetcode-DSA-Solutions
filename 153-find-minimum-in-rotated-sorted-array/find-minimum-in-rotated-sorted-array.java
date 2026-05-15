class Solution {
    public int findMin(int[] nums) 
    {
        // Arrays.sort(nums);
        // return nums[0];  
        int n = nums.length;
        if (nums[0] <= nums[n - 1]) 
        {
            return nums[0];
        }
        int left = 0, right = n - 1;
        while (left < right) 
        {
            int mid = (left + right) >> 1;
            if (nums[0] <= nums[mid]) 
                left = mid + 1;
            else 
                right = mid;
        }
        return nums[left];  
    }
}