package leetcode.medium.no1749;

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        max[0] = Math.max(0, nums[0]);
        min[0] = Math.min(0, nums[0]);
        int absMax = Math.max(Math.abs(max[0]), Math.abs(min[0]));

        for(int i = 1; i < nums.length; i++) {
            max[i] = Math.max(0, max[i-1] + nums[i]);
            min[i] = Math.min(0, min[i-1] + nums[i]);
            absMax = Math.max(absMax, Math.max(Math.abs(max[i]), Math.abs(min[i])));
        }

        return absMax;
    }
}
