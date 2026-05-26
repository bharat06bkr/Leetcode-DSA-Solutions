class Solution 
{
    public String minWindow(String s, String t) 
    {
        int hash[]=new int[123];
        for(char c:t.toCharArray())
            hash[c]++;
        int l=0,r=0,count=0,startIndex=0;
        int minIndex=Integer.MAX_VALUE;
        while(r<s.length())
        {
            if(hash[s.charAt(r)]>0)
                count++;
            hash[s.charAt(r)]--;
            while(count==t.length())
            {
                hash[s.charAt(l)]++;
                if(minIndex>(r-l+1))
                {
                    startIndex=l;;
                    minIndex=r-l+1;
                }
                if(hash[s.charAt(l)]>0)
                    count--;
                l++;
            }
            r++;
        }
        return minIndex!=Integer.MAX_VALUE ? s.substring(startIndex,startIndex+minIndex) : "";
    }
}