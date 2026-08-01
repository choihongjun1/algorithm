package leetcode.easy.no414;

import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int index = nums.length-2;
        while(index >= 0 && nums[index] == max) {
            index--;
        }
        if(index < 0) return max;

        int max2 = nums[index];
        while(index >= 0 && nums[index] == max2) {
            index--;
        }
        if(index < 0) return max;

        return nums[index];
    }
}
