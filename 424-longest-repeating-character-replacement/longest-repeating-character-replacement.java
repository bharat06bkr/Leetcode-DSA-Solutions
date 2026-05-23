class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        int max=0;
        int l=0;
        int r=0;
        int max_freq=0;
        int hash[]=new int[26];
        while(r<s.length())
        {
            char ch=s.charAt(r);
            hash[ch-'A']++;
            max_freq=Math.max(max_freq,hash[ch-'A']);
            if((r-l+1)-max_freq>k)
            {
                hash[s.charAt(l)-'A']--;
                l++;
            }
            if((r-l+1)-max_freq<=k)
                max=Math.max(max,(r-l+1));
            r++;
        } 
        return max;    
    }
}