class Solution 
{
    public int minOperations(String s) 
    {       
        return Math.min(startsWithOne(s),startsWithZero(s));
    }
    public static int startsWithOne(String s)
    {
        String str="1";
        boolean b=false;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
             if(str.charAt(str.length()-1)!=s.charAt(i)) count++;
            if(b)
            {
                str+="1";
                b=false;
            }
            else
            {
                str+="0";
                b=true;
            }
        }
        return count;
    }
    public static int startsWithZero(String s)
    {
        String str="0";
        boolean b=true;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(str.charAt(str.length()-1)!=s.charAt(i)) count++;
            if(b)
            {
                str+="1";
                b=false;
            }
            else
            {
                str+="0";
                b=true;
            }
        }
        return count;
    }
}