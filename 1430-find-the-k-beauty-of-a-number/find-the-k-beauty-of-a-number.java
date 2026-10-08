class Solution 
{
    public int divisorSubstrings(int num, int k) 
    {
        StringBuilder sb=new StringBuilder();
        String s=String.valueOf(num);
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            sb.append(s.charAt(i));
            if(sb.length()==k)
            {
                int n=Integer.parseInt(String.valueOf(sb));
                if(n!=0 && num%n==0)
                    count++;
                sb.deleteCharAt(0);
            }
        }
        return count;
    }
}