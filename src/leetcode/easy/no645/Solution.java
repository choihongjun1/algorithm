package leetcode.easy.no645;

class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean[] b = new boolean[nums.length+1];
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {
            if(b[nums[i]]) result[0] = nums[i];
            else b[nums[i]] = true;
        }

        for(int i = 1; i < b.length; i++) {
            if(!b[i]) result[1] = i;
        }

        return result;
    }
}
