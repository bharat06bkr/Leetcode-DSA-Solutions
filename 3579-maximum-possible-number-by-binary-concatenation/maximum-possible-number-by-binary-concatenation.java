class Solution 
{
    public int maxGoodNumber(int[] nums) 
    {
        String indices[]={"012","021","102","120","201","210"};
        int res=0;
        for(int i=0;i<indices.length;i++)
        {
            String index=indices[i];
            String s=toBinary(nums[index.charAt(0)-'0']) + toBinary(nums[index.charAt(1)-'0']) + toBinary(nums[index.charAt(2)-'0']);
            res=Math.max(res,convertToDecimal(s));
        }
        return res;
    }
    public static String toBinary(int n)
    {
        StringBuilder sb=new StringBuilder();
        while(n>0)
        {
            sb.insert(0,n%2);
            n/=2;
        }
        return sb.toString();
    }
    public static int convertToDecimal(String s)
    {
        int x=0;
        int res=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            int bit=s.charAt(i)-'0';
            if(bit!=0) res=res+(int)Math.pow(2,x);
            x++;
        }
        return res;
    }
}