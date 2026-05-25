package leetcode.easy.no383;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;

        int[] count = new int[26];
        for(int i = 0; i < ransomNote.length(); i++) {
            count[ransomNote.charAt(i) - 'a']++;
        }

        for(int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']--;
        }

        for(int i = 0; i < count.length; i++) {
            if(count[i] > 0) return false;
        }

        return true;
    }
}
