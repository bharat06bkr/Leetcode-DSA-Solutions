class Solution {
    public int findComplement(int n) {
        String s="";
        for(char c:Integer.toString(n,2).toCharArray())
            s=s+((c=='1')?"0":"1");
        return Integer.parseInt(s,2); 
    }
}