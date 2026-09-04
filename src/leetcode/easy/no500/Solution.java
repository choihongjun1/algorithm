package leetcode.easy.no500;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        for(String word : words) {
            if(oneRow(word.toLowerCase())) result.add(word);
        }
        return result.toArray(new String[0]);
    }

    public boolean oneRow(String word) {
        short[] row = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        int r = row[word.charAt(0)-'a'];
        for(int i = 1; i < word.length(); i++) {
            if(row[word.charAt(i)-'a'] != r) return false;
        }
        return true;
    }
}
