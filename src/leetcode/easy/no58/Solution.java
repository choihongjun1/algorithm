package leetcode.easy.no58;

class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for(int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            if(c == ' ') {
                if(len != 0) return len;
                else continue;
            }
            len++;
        }
        return len;
    }
}
