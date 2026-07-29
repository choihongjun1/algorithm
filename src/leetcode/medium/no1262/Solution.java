package leetcode.medium.no1262;

class Solution {
    public int maxSumDivThree(int[] nums) {
        int max = 0;
        int max1 = 0;
        int max2 = 0;
        int prev = 0;
        int prev1 = 0;
        int prev2 = 0;

        for(int i = 0; i < nums.length; i++) {
            int mod = nums[i] % 3;
            if(mod == 0) {
                max += nums[i];
                if(max1 != 0) max1 += nums[i];
                if(max2 != 0) max2 += nums[i];
            } else if(mod == 1) {
                if(prev2 != 0) max = Math.max(prev2 + nums[i], max);
                max1 = Math.max(prev + nums[i], max1);
                if(prev1 != 0) max2 = Math.max(prev1 + nums[i], max2);
            } else if(mod == 2) {
                if(prev1 != 0) max = Math.max(prev1 + nums[i], max);
                if(prev2 != 0) max1 = Math.max(prev2 + nums[i], max1);
                max2 = Math.max(prev + nums[i], max2);
            }

            prev = max;
            prev1 = max1;
            prev2 = max2;
        }

        return max;
    }
}
