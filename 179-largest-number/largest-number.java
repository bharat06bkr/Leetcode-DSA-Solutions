class Solution
{
    public String largestNumber(int[] nums) 
    {
        String str[]=new String[nums.length];
        for(int i=0;i<nums.length;i++)
            str[i]=String.valueOf(nums[i]);
        Arrays.sort(str,(b,a) -> (a+b).compareTo(b+a));
        if(str[0].equals("0")) return "0";
        return String.join("",str);   
    }
}