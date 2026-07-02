package leetcode.easy.no3783;

class Solution {
    public int mirrorDistance(int n) {
        int reverse = Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
        return Math.abs(n - reverse);
    }
}
