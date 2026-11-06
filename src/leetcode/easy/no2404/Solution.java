package leetcode.easy.no2404;

import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int mostFrequentEven(int[] nums) {
        int max = -1;
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                int count = map.get(nums[i]) != null ? map.get(nums[i]) + 1 : 1;
                map.put(nums[i], count);
                max = Math.max(max, count);
            }
        }

        if(map.size() == 0) return -1;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == max) return entry.getKey();
        }

        return -1;
    }
}