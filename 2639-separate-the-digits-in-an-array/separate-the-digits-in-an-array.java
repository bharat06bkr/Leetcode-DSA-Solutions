class Solution 
{
    public int[] separateDigits(int[] nums) 
    {
        List<Integer> l=new ArrayList<>();
        for(int num:nums)
        {
            String s=String.valueOf(num);
            for (char ch:s.toCharArray()) 
                l.add(ch-'0');
        }
        return listToArray(l);    
    }
    public int[] listToArray(List<Integer> l)
    {
        int arr[]=new int[l.size()];
        int i=0;
        for(int j:l)
            arr[i++]=j;
        return arr;
    }
}