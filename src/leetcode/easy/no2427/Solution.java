package leetcode.easy.no2427;

class Solution {
    public int commonFactors(int a, int b) {
        int gcd = gcd(a, b);
        return factors(gcd);
    }

    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int factors(int n) {
        int factor = 0;
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) factor += 2;
            if(i * i == n) factor--;
        }
        return factor;
    }
}
