package leetcode.easy.no575;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int type : candyType) {
            set.add(type);
        }
        return Math.min(candyType.length / 2, set.size());
    }
}
