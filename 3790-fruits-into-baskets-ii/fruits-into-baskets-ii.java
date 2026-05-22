class Solution 
{
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) 
    {
        int count=0;
        boolean visited[]=new boolean[baskets.length];
        for(int i=0;i<fruits.length;i++)
        {
            boolean check=false;
            for(int j=0;j<fruits.length;j++)
            {
                if(!visited[j] && baskets[j]>=fruits[i])
                {
                    visited[j]=true;
                    check=true;
                    break;
                }
            }
            if(!check)
                count++;
        }
        return count;
    }
}