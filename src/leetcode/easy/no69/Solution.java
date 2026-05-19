package leetcode.easy.no69;

class Solution {
    public int mySqrt(int x) {
        long sqrt = 0;
        while(sqrt * sqrt <= x) {
            sqrt++;
        }
        return (int)sqrt - 1;
    }
}
