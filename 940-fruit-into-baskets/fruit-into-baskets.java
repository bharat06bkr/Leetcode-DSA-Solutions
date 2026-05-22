class Solution 
{
    public int totalFruit(int[] fruits) 
    {
        int l=0;
        int r=0;
        int max_length=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        while(r<fruits.length)
        {
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            if(map.size()>2)
            {
                int freq=map.get(fruits[l]);
                freq--;
                map.put(fruits[l],freq);
                if(map.get(fruits[l])==0)
                    map.remove(fruits[l]);
                l++;
            }
            if(map.size()<=2)
                max_length=Math.max(max_length,r-l+1);
            r++;
        }
        return max_length;
    }
}