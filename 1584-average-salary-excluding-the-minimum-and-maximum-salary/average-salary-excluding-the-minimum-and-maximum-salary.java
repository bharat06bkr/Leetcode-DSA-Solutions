class Solution 
{
    public double average(int[] arr) 
    {
        double sum=0;
        for(int n:arr)
            sum+=n;
        Arrays.sort(arr);
        return (sum-(arr[0]+arr[arr.length-1]))/(arr.length-2);    
    }
}