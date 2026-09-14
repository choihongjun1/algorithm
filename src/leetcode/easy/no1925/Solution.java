package leetcode.easy.no1925;

class Solution {
    public int countTriples(int n) {
        int triple = 0;
        for(int a = 1; a < n; a++) {
            for(int b = a; b < n; b++) {
                int cc = a * a + b * b;
                if(cc <= n * n && isSquare(cc)) triple += a == b ? 1 : 2;
            }
        }
        return triple;
    }

    public boolean isSquare(int n) {
        return Math.sqrt(n) - (int)Math.sqrt(n) == 0;
    }
}
