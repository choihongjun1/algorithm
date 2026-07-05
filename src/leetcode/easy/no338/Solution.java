package leetcode.easy.no338;

class Solution {
    public int[] countBits(int n) {
        int[] bit = new int[n+1];
        int d = 0;
        for(int i = 1; i <= n; i++) {
            if(i == Math.pow(2, d) * 2) d++;
            bit[i] = bit[i - (int)Math.pow(2, d)] + 1;
        }
        return bit;
    }
}
