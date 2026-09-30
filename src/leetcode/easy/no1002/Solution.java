package leetcode.easy.no1002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        int[] count = new int[26];
        int[] result = new int[26];
        Arrays.fill(result, Integer.MAX_VALUE);

        for(String word : words) {
            for(char c : word.toCharArray()) {
                count[c-'a']++;
            }
            for(int i = 0; i < result.length; i++) {
                result[i] = Math.min(result[i], count[i]);
            }
            count = new int[26];
        }

        List<String> ans = new ArrayList<>();
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i]; j++) {
                ans.add(String.valueOf((char)('a'+i)));
            }
        }

        return ans;
    }
}
