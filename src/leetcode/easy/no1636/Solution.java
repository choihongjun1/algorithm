package leetcode.easy.no1636;

import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        Integer[] numsArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(numsArr, (a, b) -> {
            int freqA = freq.get(a);
            int freqB = freq.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqA, freqB);
            }
            return Integer.compare(b, a);
        });

        return Arrays.stream(numsArr).mapToInt(Integer::intValue).toArray();
    }
}
