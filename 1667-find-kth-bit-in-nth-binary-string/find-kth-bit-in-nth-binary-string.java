class Solution 
{
    public char findKthBit(int n, int k) 
    {
        String s="0";
        for(int i=1;i<n;i++)
            s=s+"1"+invert(s);
        return s.charAt(k-1);
    }
    public static String invert(String s)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='1') sb.append("0");
            else sb.append("1");
        }
        return sb.reverse().toString();
    }
}