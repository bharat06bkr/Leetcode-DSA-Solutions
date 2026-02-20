class Solution 
{
    public int countBinarySubstrings(String s) 
    {
        int res=0;
        int zeros=0;
        int ones=0;
        boolean z=false;
        boolean o=false;
        char arr[]=s.toCharArray();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='0')
            {
                if(o)
                {
                    l.add(ones);
                    o=false;
                    ones=0;
                }
                zeros++;
                z=true;
            }
            else
            {
                if(z)
                {
                    l.add(zeros);
                    z=false;
                    zeros=0;
                }
                o=true;
                ones++;
            }
        }
        if(ones!=0) l.add(ones);
        if(zeros!=0) l.add(zeros);
        for(int i=1;i<l.size();i++)
            res+=Math.min(l.get(i-1),l.get(i));
        return res;  
    }
}