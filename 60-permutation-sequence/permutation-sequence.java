class Solution 
{
    public String getPermutation(int n, int k) 
    {
        StringBuilder sb=new StringBuilder();
        List<Integer> l=new ArrayList<>();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            l.add(i);
            fact*=i;
        }
        fact=fact/n;
        n=n-1;
        k=k-1;
        while(true)
        {
            sb.append(l.get(k/fact));
            l.remove(k/fact);
            if(l.size()==0)
                break;
            k=k%fact;
            fact=fact/n;
            n=n-1;
        }
        return new String(sb);
    }
}