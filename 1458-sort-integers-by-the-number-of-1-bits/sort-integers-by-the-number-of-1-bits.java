import java.util.*;
class Solution 
{
    public int[] sortByBits(int[] arr) 
    {
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>();
        for(int num : arr)
            list.add(new AbstractMap.SimpleEntry<>(num, Integer.bitCount(num)));
        Collections.sort(list,(a,b) ->
        {
            if(!a.getValue().equals(b.getValue()))
                return a.getValue()-b.getValue();
            return a.getKey()-b.getKey();
        });
        int i=0;
        for(Map.Entry<Integer,Integer> l:list)
            arr[i++]=l.getKey();
        return arr;
    }
}