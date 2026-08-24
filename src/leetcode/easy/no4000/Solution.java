package leetcode.easy.no4000;

class Solution {
    public int largestInteger(int n, int s) {
        if(9 * n < s) return -1;
        int d = (int)Math.pow(10, n-1);
        int result = 0;
        while(d > 0) {
            result += d * Math.min(9, s);
            s -= Math.min(9, s);
            d /= 10;
        }
        return result;
    }
}
