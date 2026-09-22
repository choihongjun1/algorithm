package leetcode.easy.no1880;

class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return numericValue(firstWord) + numericValue(secondWord) == numericValue(targetWord);
    }

    public int numericValue(String s) {
        int result = 0;
        int pow = 1;
        for(int i = s.length()-1; i >= 0; i--) {
            int letterValue = s.charAt(i) - 'a';
            result += letterValue * pow;
            pow *= 10;
        }
        return result;
    }
}
