package leetcode.easy.no1365;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        for(int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int[] sum = new int[101];
        sum[0] = count[0];
        for(int i = 1; i < sum.length; i++) {
            sum[i] = sum[i-1] + count[i];
        }

        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) result[i] = 0;
            else result[i] = sum[nums[i]-1];
        }

        return result;
    }
}