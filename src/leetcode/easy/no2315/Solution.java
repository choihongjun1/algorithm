package leetcode.easy.no2315;

class Solution {
    public int countAsterisks(String s) {
        boolean pair = false;
        int asterisk = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '|') pair = !pair;
            else if(!pair && s.charAt(i) == '*') {
                asterisk++;
            }
        }
        return asterisk;
    }
}
