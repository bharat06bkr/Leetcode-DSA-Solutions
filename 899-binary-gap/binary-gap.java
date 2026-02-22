class Solution 
{
    public int binaryGap(int n) 
    {
        int large=0;
        int count=0;
        boolean b=false;
        char arr[]=(Integer.toString(n,2)).toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='1')
            {
                if(b)
                {
                    large=Math.max(large,count);
                    count=1;
                }
                else    
                {
                    b=true;
                    count++;
                }
            }
            else if(b)
                count++;
        }
        return large;    
    }
}