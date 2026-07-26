package leetcode.medium.no279;

class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int i = 1; i <= n; i++) {
            int base = 1;
            dp[i] = i;
            while(base * base <= i) {
                if(dp[i - base * base] + 1 < dp[i]) dp[i] = dp[i - base * base] + 1;
                base++;
            }
        }

        return dp[n];
    }
}
