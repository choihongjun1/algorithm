package leetcode.easy.no806;

class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] result = new int[2];
        result[0] = 1;
        for(int i = 0; i < s.length(); i++) {
            int w = widths[s.charAt(i)-'a'];
            if(result[1] + w <= 100) result[1] += w;
            else {
                result[0]++;
                result[1] = w;
            }
        }
        return result;
    }
}
