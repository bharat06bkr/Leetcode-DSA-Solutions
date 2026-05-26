class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        int l=0,r=0,count=0,minLength=Integer.MAX_VALUE;
        int hash[]=new int[123];
        for(char ch:s1.toCharArray())
            hash[ch]++;
        while(r<s2.length())
        {
            if(hash[s2.charAt(r)]>0)
                count++;
            hash[s2.charAt(r)]--;
            while(count==s1.length())
            {
                if(minLength>(r-l+1))
                {
                    minLength=r-l+1;
                    if(minLength==s1.length())
                        return true;
                }
                hash[s2.charAt(l)]++;
                if(hash[s2.charAt(l)]>0)
                    count--;
                l++;
            }
            r++;
        }
        return false;
    }
}