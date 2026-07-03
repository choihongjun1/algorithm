package leetcode.medium.no413;

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 3) return 0;

        int result = 0;
        int seqLen = 2;
        int prev = nums[0] - nums[1];
        for(int i = 1; i < nums.length-1; i++) {
            int diff = nums[i] - nums[i+1];
            if(diff == prev) {
                seqLen++;
            } else {
                if(seqLen > 2) result += (seqLen-2) * (seqLen-1) / 2;
                seqLen = 2;
            }
            prev = diff;
        }
        if(seqLen > 2) result += (seqLen-2) * (seqLen-1) / 2;

        return result;
    }
}