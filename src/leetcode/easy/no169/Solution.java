package leetcode.easy.no169;

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length/2.0; i++) {
            int left = nums[i];
            int right = nums[i + nums.length/2];
            if(left == right) return left;
        }
        return -1;
    }
}
