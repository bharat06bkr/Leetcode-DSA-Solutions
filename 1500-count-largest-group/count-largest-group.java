class Solution 
{
    public int countLargestGroup(int n) 
    {
        int count=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int max=0;
        for(int i=1;i<=n;i++)
        {
            int num=i;
            int sum=0;
            while(num>0)
            {
                sum+=num%10;
                num/=10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            max=Math.max(max,map.get(sum));
        }
        for(int val:map.values())
            if(val==max)  count++;
        return count;
    }
}