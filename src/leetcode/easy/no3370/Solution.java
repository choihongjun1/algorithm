package leetcode.easy.no3370;

class Solution {
    public int smallestNumber(int n) {
        int x = 2;
        while(x-1 < n) {
            x *= 2;
        }
        return x-1;
    }
}
