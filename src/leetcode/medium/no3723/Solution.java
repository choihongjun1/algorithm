package leetcode.medium.no3723;

class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(9 * num < sum) return "";

        String result = "";
        for(int i = 9; i >= 1; i--) {
            int count = sum / i;
            result += String.valueOf(i).repeat(count);
            sum %= i;
        }
        if(num > result.length()) result += "0".repeat(num-result.length());

        return result;
    }
}
