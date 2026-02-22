class Solution 
{
    public int reinitializePermutation(int n) 
    {
        int count=0;
        int perm[]=new int[n];
        for(int i=0;i<n;i++)
            perm[i]=i;
        int org_arr[]=Arrays.copyOf(perm,n);
        for(int j=0;j<n;j++)
        {
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                if(i%2==0)  arr[i]=perm[i/2];
                else arr[i]=perm[n/2+(i-1)/2];  
            }
            count++;
            if(Arrays.equals(org_arr,arr))   return count;
            perm=Arrays.copyOf(arr,arr.length);
        }
        return count;    
    }
}