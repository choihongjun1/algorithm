package leetcode.easy.no2833;

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int d = 0;
        int underBar = 0;
        for(int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i) == 'R') d++;
            else if(moves.charAt(i) == 'L') d--;
            else underBar++;
        }
        return Math.abs(d) + underBar;
    }
}
