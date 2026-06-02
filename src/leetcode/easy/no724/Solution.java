package leetcode.easy.no724;

class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }

        int pivot = 0;
        while(leftSum != rightSum) {
            if(pivot >= nums.length) return -1;
            leftSum += nums[pivot];
            pivot++;
            if(pivot < nums.length) rightSum -= nums[pivot];
            else rightSum = 0;
        }

        if(pivot >= nums.length) return -1;
        else return pivot;
    }
}
