// class Solution 
// {
//     public int minFlips(String s) 
//     {
//         if(s.length()==1)   return 0;
//         return Math.min(startsWithZero(s),startsWithOne(s));    
//     }
//     public int startsWithZero(String s)
//     {
//         int count=0;
//         for(int i=0;i<s.length();i++)
//         {
//             if(i%2==0&&s.charAt(i)!='0') count++;
//             if(i%2==1 && s.charAt(i)!='1') count++;
//         }
//         return count;
//     }
//     public int startsWithOne(String s)
//     {
//         int count=0;
//         for(int i=0;i<s.length();i++)
//         {
//             if(i%2==0&&s.charAt(i)!='1') count++;
//             if(i%2==1 && s.charAt(i)!='0') count++;
//         }
//         return count;
//     }
// }
/*
    Passed 34/65 i don't why i am not thinking purely about the optimal solution BUt i will come stronger next time eith more confidence
    Wish me all the best ra bhartuuu
*/

/*
    Your code works for making the string alternating without rotation, but the problem Minimum Number of Flips to Make the Binary String Alternating allows rotation of the string before flipping.

That is why for:

s = "01001001101"

Your output → 5
Expected → 2

Because rotating the string can reduce flips.

Example rotation:

Original: 01001001101
Rotate  : 10010011010

Now compare with alternating patterns:

Pattern1: 10101010101
Pattern2: 01010101010

Minimum flips become 2.

❗ Main Error in Your Code

Your algorithm only checks:

Original string vs
0101010101...
1010101010...

But the problem requires checking all rotations of the string.

Since rotation changes even/odd index positions, your method fails.
*/


class Solution 
{
    public int minFlips(String s) 
    {
        int n = s.length();
        s = s + s;

        int diff1 = 0, diff2 = 0;
        int ans = Integer.MAX_VALUE;
        int left = 0;

        for(int right = 0; right < s.length(); right++)
        {
            char expected1 = (right % 2 == 0) ? '0' : '1';
            char expected2 = (right % 2 == 0) ? '1' : '0';

            if(s.charAt(right) != expected1) diff1++;
            if(s.charAt(right) != expected2) diff2++;

            if(right - left + 1 > n)
            {
                char leftExpected1 = (left % 2 == 0) ? '0' : '1';
                char leftExpected2 = (left % 2 == 0) ? '1' : '0';

                if(s.charAt(left) != leftExpected1) diff1--;
                if(s.charAt(left) != leftExpected2) diff2--;

                left++;
            }

            if(right - left + 1 == n)
                ans = Math.min(ans, Math.min(diff1, diff2));
        }

        return ans;
    }
}