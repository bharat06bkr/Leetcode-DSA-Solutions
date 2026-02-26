class Solution 
{
    public int integerReplacement(int n) 
    {
        int count=0;
        if(n==2147483647)  return 32;
        while(n!=1)
        {
            if((n&1)==1)    
            {
                if(n==3 || (n&3)==1)
                    n=n-1;   // last two bits 11 unte thesai  lekunte add chey rraa
                else 
                    n=n+1;
            }
            else n=n>>1;
            count++;
        } 
        return count;   
    }
}