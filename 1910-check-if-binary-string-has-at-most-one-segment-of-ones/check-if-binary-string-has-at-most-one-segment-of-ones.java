class Solution 
{
    public boolean checkOnesSegment(String s) 
    {
        boolean oneSegment=false;
        boolean zeroArrived=false;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='1' && zeroArrived)  return false;
            else if(ch=='1')    oneSegment=true;
            else zeroArrived=true;
        }
        if(oneSegment)  return true;
        else return false;    
    }
}