package leetcode.easy.no1175;

class Solution {
    public int numPrimeArrangements(int n) {
        int mod = 1000000007;
        int primes = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                primes++;
            }
        }
        long ans = 1;
        for (int i = 1; i <= primes; i++) {
            ans = (ans * i) % mod;
        }
        for (int i = 1; i <= n - primes; i++) {
            ans = (ans * i) % mod;
        }
        return (int) ans;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
