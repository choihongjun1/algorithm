package leetcode.easy.no190;

class Solution {
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        String reverse = new StringBuilder(binary).reverse().toString();
        int r = 0;
        for(int i = 0; i < reverse.length(); i++) {
            if(reverse.charAt(i) == '1') r += Math.pow(2, 31-i);
        }
        return r;
    }
}
