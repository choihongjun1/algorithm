package leetcode.easy.no2114;

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i = 0; i < sentences.length; i++) {
            int word = sentences[i].split(" ").length;
            if(word > max) max = word;
        }
        return max;
    }
}
