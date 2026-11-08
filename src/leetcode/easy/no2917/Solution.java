package leetcode.easy.no2917;

class Solution {
    public int findKOr(int[] nums, int k) {
        int[] count = new int[32];
        for(int i = 0; i < nums.length; i++) {
            int d = 0;
            while(nums[i] != 0) {
                count[d++] += nums[i] % 2;
                nums[i] /= 2;
            }
        }

        int kor = 0;
        for(int i = 0; i < count.length; i++) {
            if(count[i] >= k) kor += Math.pow(2, i);
        }
        return kor;
    }
}
