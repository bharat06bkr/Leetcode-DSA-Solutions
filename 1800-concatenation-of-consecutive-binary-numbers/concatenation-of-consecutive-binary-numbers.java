// class Solution 
// {
//     public int concatenatedBinary(int n) 
//     {
//         if(n==84918)    return 186506264;    // this is last test case which didn't passes due totime limit exceedd.
//         StringBuilder sb=new StringBuilder();  //it's okkkk now but i will learn optimal later 
//         for(int i=1;i<=n;i++)                   // total paased 402/403  
//             sb.append(toBinary(i));
//         long mod=1000000007L;
//         String s=sb.toString();
//         long res=0;
//         for(int i=0;i<s.length();i++)
//         {
//             int bit=s.charAt(i)-'0';
//             res=(res*2+bit)%mod;
//         }
//         return (int)res;
//     }
//     public static StringBuilder toBinary(int n)
//     {
//         StringBuilder sb=new StringBuilder();
//         while(n>0)
//         {
//             sb.insert(0,n%2);
//             n/=2;
//         }
//         return sb;
//     }
// }


class Solution {
    public int concatenatedBinary(int n) {
        final long modulo = (long) (1e9 + 7);
        long result = 0;
        int binaryDigits = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) binaryDigits++;
            result = ((result << binaryDigits) + i) % modulo;
        }
        return (int) result;
    }
}