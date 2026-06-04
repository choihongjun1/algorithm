package leetcode.easy.no762;


class Solution {
    public int countPrimeSetBits(int left, int right) {
        boolean[] isPrime = {false, false, true, true, false, true, false, true, false, false, false, true, false, true, false, false, false, true, false, true, false};
        int count = 0;

        for(int i = left; i <= right; i++) {
            int sum = 0;
            int n = i;
            while(n != 0) {
                sum += n % 2;
                n /= 2;
            }
            if(isPrime[sum]) count++;
        }

        return count;
    }
}