package leetcode.easy.no504;

class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        String result = "";
        int abs = Math.abs(num);
        while(abs != 0) {
            result = (abs % 7) + result;
            abs /= 7;
        }
        if(num < 0) result = "-" + result;
        return result;
    }
}
