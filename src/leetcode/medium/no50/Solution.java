package leetcode.medium.no50;

class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n == 2) return x * x;

        double sqrt = myPow(x, Math.abs(n / 2));
        double res = n % 2 == 0 ? sqrt * sqrt : sqrt * sqrt * x;
        return n < 0 ? 1 / res : res;
    }
}
