package leetcode.medium.no2195;

import java.util.Arrays;

class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        int index = 0;
        int start = 0;
        int end;
        while(index < nums.length) {
            end = nums[index];
            for(int i = start+1; i < end; i++) {
                sum += i;
                k--;
                if(k == 0) return sum;
            }
            start = end;
            index++;
        }

        while(k > 0) {
            sum += ++start;
            k--;
        }
        return sum;
    }
}
