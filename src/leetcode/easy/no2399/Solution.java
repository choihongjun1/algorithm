package leetcode.easy.no2399;

class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for (int i = 0; i < s.length(); i++) {
            int charIndex = s.charAt(i) - 'a';
            int secondIndex = s.indexOf(s.charAt(i), i + 1);

            if (secondIndex != -1) {
                int actualDistance = secondIndex - i - 1;
                if (actualDistance != distance[charIndex]) {
                    return false;
                }
            }
        }
        return true;
    }
}
