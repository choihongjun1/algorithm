package leetcode.easy.no1470;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        for(int i = 0; i < n; i++) {
            result[2*i] = nums[i];
        }
        for(int i = n; i < nums.length; i++) {
            result[2*(i-n)+1] = nums[i];
        }
        return result;
    }
}
