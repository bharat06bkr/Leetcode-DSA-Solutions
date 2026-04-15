
/*
import java.util.Scanner;
import java.lang.Math;

class Solution 
{
    public static int reverse(int x) 
    {
        if(x==0)
            return 0;
        boolean isNegative=x<0;
        int num=Math.abs(x);
        int reverseNumber=0;
        while(num>0)
        {
            int digit=num%10;
            reverseNumber=reverseNumber*10+digit;
            num=num/10;
        }
        return (isNegative) ? 0-reverseNumber : reverseNumber;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(reverse(sc.nextInt()));
    }
}
*/

import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        int sum = 0;
        while (x != 0) {
            int digit = x % 10;
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;
            sum = sum * 10 + digit;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Solution solution = new Solution();
        int reversed = solution.reverse(x);
        System.out.println( reversed);
    }
}

