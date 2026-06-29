package leetcode.easy.no2843;

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low; i <= high; i++) {
            if(i % 11 == 0 && i < 100) count++;
            if(i >= 1000 && i < 10000) {
                int right = i % 10 + ((i/10) % 10);
                int left = i / 1000 + ((i/100) % 10);
                if(left == right) count++;
            }
        }
        return count;
    }
}
