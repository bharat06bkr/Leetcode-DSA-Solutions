class Solution 
{
    public int getCommon(int[] nums1, int[] nums2) 
    {
        if(nums1[nums1.length-1]<nums2[0] || nums2[nums2.length-1]<nums1[0])
            return -1;
        int l=0;
        int r=0;
        while(l<nums1.length && r<nums2.length)
        {
            if(nums1[l]>nums2[r])   
                r++;
            else if(nums1[l]<nums2[r])
                l++;
            else
                return nums1[l];
        }
        return -1;
    }
}