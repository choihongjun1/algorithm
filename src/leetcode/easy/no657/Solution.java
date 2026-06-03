package leetcode.easy.no657;

class Solution {
    public boolean judgeCircle(String moves) {
        int h = 0;
        int w = 0;
        for(int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if(c == 'U') h++;
            else if(c == 'D') h--;
            else if(c == 'L') w--;
            else if(c == 'R') w++;
        }
        return h == 0 && w == 0;
    }
}
