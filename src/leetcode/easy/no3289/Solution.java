package leetcode.easy.no3289;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] count = new int[nums.length-2];
        int[] result = new int[2];
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
            if(count[nums[i]] == 2) result[index++] = nums[i];
        }
        return result;
    }
}