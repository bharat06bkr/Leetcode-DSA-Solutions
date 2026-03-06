class Solution 
{
    public String trimTrailingVowels(String s) 
    {
        String str="aeiou";
        StringBuilder sb=new StringBuilder(s);
        while(sb.length()>0 && str.contains(String.valueOf(sb.charAt(sb.length()-1))))    sb=sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}