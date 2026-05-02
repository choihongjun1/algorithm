package leetcode.easy.no14;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for(int i = 0; ; i++) {
            if(strs[0].length() <= i) return prefix;
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].length() <= i) return prefix;
                if(strs[j].charAt(i) != c) return prefix;
            }
            prefix += c;
        }
    }
}
