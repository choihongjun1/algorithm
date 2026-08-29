package leetcode.medium.no738;

class Solution {
    public int monotoneIncreasingDigits(int n) {
        int len = 0;
        int temp = n;
        int prev = 10;

        while(temp > 0) {
            len++;
            int curr = temp % 10;
            if(curr > prev) return monotoneIncreasingDigits(n - 1 - (n % (int)Math.pow(10, len-1)));
            temp /= 10;
            prev = curr;
        }

        return n;
    }
}
