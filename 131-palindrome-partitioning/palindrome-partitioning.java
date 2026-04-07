class Solution 
{
    List<List<String>> res=new ArrayList<>();
    public List<List<String>> partition(String s) 
    {
        solve(0,s,new ArrayList<>());
        return res;
    }
    void solve(int start,String s,List<String> l)
    {
        if(start==s.length())
        {
            res.add(new ArrayList<>(l));
            return;
        }
        for(int end=start+1;end<=s.length();end++)
        {
            if(isPalindrome(s,start,end-1))
            {
                l.add(s.substring(start,end));
                solve(end,s,l);
                l.remove(l.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int l,int r)
    {
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))    return false;
            l++;
            r--;
        }
        return true;
    }
}