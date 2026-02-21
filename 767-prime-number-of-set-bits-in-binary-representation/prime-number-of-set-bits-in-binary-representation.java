class Solution 
{
    public int countPrimeSetBits(int left, int right) 
    {
        int count=0;
        for(int i=left;i<=right;i++)
            if(isPrime(Integer.bitCount(i)))    count++;
        return count;
    }
    private static boolean isPrime(int n)
    {
        boolean b[]=new boolean[n+1];
        Arrays.fill(b,true);
        b[0]=false;
        b[1]=false;
        for(int i=2;i*i<=n;i++)
        {
            if(b[i])
            {
                for(int j=i*i;j<=n;j+=i)
                    b[j]=false;
            }
        }
        return b[n];
    }
}