package leetcode.easy.no2932;

class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                boolean strong = Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j]);
                if(strong) {
                    int xor = nums[i] ^ nums[j];
                    max = Math.max(max, xor);
                }
            }
        }
        return max;
    }
}
