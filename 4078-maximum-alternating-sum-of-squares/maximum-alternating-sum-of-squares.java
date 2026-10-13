import java.util.*;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] sq = new long[n];
        for (int i = 0; i < n; i++) 
        {
            long v = nums[i];
            sq[i] = v * v; 
        }
        Arrays.sort(sq);
        int k = (n + 1) / 2;
        long s1 = 0L;
        long s2 = 0L;
        for (int i = 0; i < k; i++) {
            s1 += sq[n - 1 - i];
        }
        for (int i = 0; i < n - k; i++) {
            s2 += sq[i];
        }
        return s1 - s2;
}
}
