class Solution 
{
    public String arrangeWords(String text) 
    {
        String arr[]=text.split("\\s+");
        // Arrays.sort(arr,(a,b)->
        // {
        //     if(a.length()!=b.length())    // No stable sort
        //         return a.length()-b.length();
        //     return a.length();
        // });
        // List<String> list = new ArrayList<>(Arrays.asList(arr));
        // list.sort((a, b) -> Integer.compare(a.length(), b.length()));
        Arrays.sort(arr,(a,b)->
        {
            return a.length()-b.length();
        });
        String s=String.join(" ",arr); 
        s=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
        return s;   
    }
}