class Solution 
{
    public int divide(int dividend, int divisor) 
    {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        if(dividend==divisor)   return 1;
        boolean sign=true;
        if((dividend>=0 && divisor<0) || (dividend<0 && divisor>0))
            sign=false;
        long ans=0;
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        while(n>=d)
        {
            int count=0;
            while(n>=(d<<(count+1)))  // 1<<count means 2powcount // 2pow0 , 2pow1, 2pow 3 like that
                count+=1;
            ans+=(1<<count);
            n=n-(d<<count);
        }
         if(ans==(1<<31) && sign)
            return Integer.MAX_VALUE;
        if(ans==(1<<31) && !sign)
            return Integer.MIN_VALUE;
        return sign?(int)ans:(int)-ans;
    }
}