package leetcode.easy.no268;

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        int miss = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i) {
                miss = i;
                break;
            }
        }
        return miss;
    }
}
