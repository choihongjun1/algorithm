package leetcode.hard.no76;

class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[52];
        int[] count = new int[52];
        int missing = 0;
        int min = Integer.MAX_VALUE;
        String res = "";

        // t의 문자 개수 저장
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            int index = c <= 'Z' ? c - 'A' : c - 'a' + 26;
            need[index]++;
            if(need[index] == 1) missing++;
        }

        int l = 0;
        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            int index = c <= 'Z' ? c - 'A' : c - 'a' + 26;

            // 오른쪽 원소 추가
            count[index]++;
            if(count[index] == need[index]) missing--;

            // 왼쪽 축소
            while(missing == 0) {
                if(r-l+1 < min) {
                    min = r-l+1;
                    res = s.substring(l, r+1);
                }

                char lc = s.charAt(l);
                index = lc <= 'Z' ? lc - 'A' : lc - 'a' + 26;

                count[index]--;
                if(count[index] == need[index]-1) missing++;

                l++;
            }
        }

        return res;
    }
}