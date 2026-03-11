class Solution {
    public int findComplement(int n) {
        // String s="";
        // for(char c:Integer.toString(n,2).toCharArray())
        //     s=s+((c=='1')?"0":"1");
        // return Integer.parseInt(s,2); 
        int bit=1;
        while(bit<n)
            bit=(bit<<1)|1;
        return bit^n;
    }
}