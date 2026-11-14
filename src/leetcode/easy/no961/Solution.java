package leetcode.easy.no961;

class Solution {
    public int repeatedNTimes(int[] nums) {
        boolean[] appeared = new boolean[10001];
        for(int i = 0; i < nums.length; i++) {
            if(appeared[nums[i]]) return nums[i];
            appeared[nums[i]] = true;
        }
        return -1;
    }
}
