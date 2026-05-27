package leetcode.easy.no896;

class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        for(int i = 1; i < nums.length; i++) {
            if(!increasing && !decreasing) return false;

            if(nums[i] < nums[i-1]) increasing = false;
            else if(nums[i] > nums[i-1]) decreasing = false;
        }

        return increasing || decreasing;
    }
}
