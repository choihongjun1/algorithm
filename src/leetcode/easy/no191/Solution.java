package leetcode.easy.no191;

class Solution {
    public int hammingWeight(int n) {
        int bit = 0;
        while(n != 0) {
            bit += n % 2;
            n /= 2;
        }
        return bit;
    }
}
