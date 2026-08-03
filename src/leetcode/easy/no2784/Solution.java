package leetcode.easy.no2784;

class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length - 1;
        if(n < 1) return false;

        int last = 0;
        boolean[] count = new boolean[n];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > n) return false;
            else if(nums[i] == n) last++;
            else if(count[nums[i]]) return false;
            else count[nums[i]] = true;
        }

        if(last != 2) return false;
        for(int i = 1; i < n; i++) {
            if(!count[i]) return false;
        }
        return true;
    }
}
