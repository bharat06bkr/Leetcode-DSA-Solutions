class Solution 
{
    public String countAndSay(int n) 
    {
        StringBuilder sb=new StringBuilder("1");
        int range=0;
        for(int i=1;i<n;i++)
        {
           range=sb.length();
           sb.append("0");
           sb.append(solve((sb.toString()).substring(0,range)));
           sb.delete(0,range+1);
        }
        return sb.toString();
    }
    public StringBuilder solve(String s)
    {
        int count=0;
        char arr[]=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        char value=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(value==arr[i])
                count++;
            else
            {
                sb.append(String.valueOf(count));
                sb.append(String.valueOf(value));
                value=arr[i];
                count=1;
            }
        }
        sb.append(String.valueOf(count));
        sb.append(String.valueOf(value));
        return sb;
    }
}