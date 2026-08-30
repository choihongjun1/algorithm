package leetcode.medium.no2405;

class Solution {
    public int partitionString(String s) {
        boolean[] arr = new boolean[26];
        int sub = 1;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(arr[c-'a']) {
                sub++;
                arr = new boolean[26];
            }
            arr[c-'a'] = true;
        }
        return sub;
    }
}
