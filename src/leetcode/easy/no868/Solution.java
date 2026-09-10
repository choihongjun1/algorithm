package leetcode.easy.no868;

class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int prev = -1;
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                if(prev != -1) {
                    int d = i - prev;
                    max = Math.max(max, d);
                }
                prev = i;
            }
        }
        return max;
    }
}
