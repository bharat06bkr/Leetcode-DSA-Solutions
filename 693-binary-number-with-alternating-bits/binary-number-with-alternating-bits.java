class Solution 
{
    public boolean hasAlternatingBits(int n) 
    {
        String s=Integer.toString(n,2);
        for(int i=0;i<s.length()-1;i++)
            if((Character.getNumericValue(s.charAt(i))^Character.getNumericValue(s.charAt(i+1)))!=1)   return false;
        return true;   
    }
}