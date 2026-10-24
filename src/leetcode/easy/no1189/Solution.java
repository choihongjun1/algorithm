package leetcode.easy.no1189;

class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[5];
        for(char c : text.toCharArray()) {
            if(c == 'a') count[0]++;
            else if(c == 'b') count[1]++;
            else if(c == 'l') count[2]++;
            else if(c == 'o') count[3]++;
            else if(c == 'n') count[4]++;
        }

        int balloon = Math.min(Math.min(count[0], count[1]), count[4]);
        balloon = Math.min(balloon, Math.min(count[2]/2, count[3]/2));
        return balloon;
    }
}
