package leetcode.medium.no567;

import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] sorted = s1.toCharArray();
        Arrays.sort(sorted);

        for(int i = 0; i <= s2.length() - s1.length(); i++) {
            String sub = s2.substring(i, i+s1.length());
            char[] arr = sub.toCharArray();
            Arrays.sort(arr);

            if(Arrays.equals(arr, sorted)) return true;
        }

        return false;
    }
}
