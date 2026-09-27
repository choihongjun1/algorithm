package leetcode.easy.no1913;

class Solution {
    public int maxProductDifference(int[] nums) {
        int max = 0;
        int secondMax = 0;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                secondMax = max;
                max = nums[i];
            }
            else if(nums[i] > secondMax) {
                secondMax = nums[i];
            }

            if(nums[i] < min) {
                secondMin = min;
                min = nums[i];
            }
            else if(nums[i] < secondMin) {
                secondMin = nums[i];
            }
        }

        return max * secondMax - min * secondMin;
    }
}
