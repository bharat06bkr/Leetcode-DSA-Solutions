class Solution 
{
    public int maxConsecutiveAnswers(String answerKey, int k) 
    {
        return Math.max(no_of_fs(answerKey,k),no_of_ts(answerKey,k));
    }
    public int no_of_fs(String answerKey,int k)
    {
        int max=0;
        int l=0;
        int r=0;
        int no_of_f=0;
        while(r<answerKey.length())
        {
            if(answerKey.charAt(r)=='F')
                no_of_f++;
            while(no_of_f>k)
            {
                if(answerKey.charAt(l)=='F')
                    no_of_f--;
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
    public int no_of_ts(String answerKey,int k)
    {
        int max=0;
        int l=0;
        int r=0;
        int no_of_t=0;
        while(r<answerKey.length())
        {
            if(answerKey.charAt(r)=='T')
                no_of_t++;
            while(no_of_t>k)
            {
                if(answerKey.charAt(l)=='T')
                    no_of_t--;
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}