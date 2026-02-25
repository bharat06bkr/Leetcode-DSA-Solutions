import java.util.*;
class Solution 
{
    public int[] sortByBits(int[] arr) 
    {
        // List<Map.Entry<Integer,Integer>> list = new ArrayList<>();
        // for(int num : arr)
        //     list.add(new AbstractMap.SimpleEntry<>(num, Integer.bitCount(num)));
        // Collections.sort(list,(a,b) ->
        // {
        //     if(!a.getValue().equals(b.getValue()))
        //         return a.getValue()-b.getValue();
        //     return a.getKey()-b.getKey();
        // });
        // int i=0;
        // for(Map.Entry<Integer,Integer> l:list)
        //     arr[i++]=l.getKey();
        // return arr;


        Integer temp[]=new Integer[arr.length];
        for(int i=0;i<arr.length;i++)   temp[i]=arr[i];
        Arrays.sort(temp,(a,b) ->
        {
            int v1=Integer.bitCount(a);
            int v2=Integer.bitCount(b);
            if(v1==v2)  return a-b;
            return v1-v2;
        });
        for(int i=0;i<arr.length;i++)   arr[i]=temp[i];
        return arr;
    }
}