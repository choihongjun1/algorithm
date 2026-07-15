package leetcode.medium.no1922;

class Solution {
    public int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        return (int) (power(5, evenPositions) * power(4, oddPositions) % 1000000007);
    }

    public long power(long base, long exp) {
        int mod = 1000000007;
        long res = 1;
        base %= mod;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % mod;
            base = (base * base) % mod;
            exp /= 2;
        }
        return res;
    }
}
