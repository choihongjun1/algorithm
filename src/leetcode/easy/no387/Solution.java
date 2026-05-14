package leetcode.easy.no387;

import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.firstUniqChar("leetcode");
    }

    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int[] index = new int[26];
        Set<Character> set = new LinkedHashSet<>();
        for(int i = 0; i < index.length; i++) index[i] = -1;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
            if(index[c - 'a'] == -1) index[c - 'a'] = i;
            set.add(c);
        }

        for(char c : set) {
            if(count[c - 'a'] == 1) return index[c - 'a'];
        }

        return -1;
    }
}
