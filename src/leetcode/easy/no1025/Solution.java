package leetcode.easy.no1025;

class Solution {
    public boolean divisorGame(int n) {
        boolean[] dp = new boolean[n+1];
        dp[1] = false;
        for(int num = 2; num <= n; num++) {
            for(int i = 1; i < num; i++) {
                if(num % i == 0 && !dp[num-i]) {
                    dp[num] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
