class Solution 
{
    int length;
    public String findDifferentBinaryString(String[] nums) 
    {
        length=nums[0].length();
        List<String> l=new ArrayList<>();        
        List<String> list=new ArrayList<>(Arrays.asList(nums));
        generateBinaryString("",l);
        for(String str:l)
            if(!list.contains(str))   return str;
        char arr[]=new char[length];
        Arrays.fill(arr,'0');
        return new String(arr);
    }
    public void generateBinaryString(String s,List<String> l)
    {
        if(s.length()==length)  
        {
            l.add(s);
            return;
        }
        generateBinaryString(s+"1",l);
        if(s.isEmpty() || s.charAt(s.length()-1)!='0')
            generateBinaryString(s+"0",l);
    }
}