package leetcode.easy.no2404;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }

        if (countMap.isEmpty()) {
            return -1;
        }

        int mostFrequent = -1;
        int maxFreq = -1;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq) {
                maxFreq = freq;
                mostFrequent = num;
            } else if (freq == maxFreq) {
                if (num < mostFrequent) {
                    mostFrequent = num;
                }
            }
        }

        return mostFrequent;
    }
}