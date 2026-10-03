package leetcode.easy.no1952;

class Solution {
    public boolean isThree(int n) {
        return isSquare(n) && isPrime((int)Math.sqrt(n));
    }

    public boolean isSquare(int n) {
        return Math.sqrt(n) == (int)Math.sqrt(n);
    }

    public static boolean isPrime(int n) {
        if(n == 1) return false;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
