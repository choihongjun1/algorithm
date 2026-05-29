package leetcode.easy.no448;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] appeared = new boolean[nums.length + 1];
        for(int i : nums) {
            appeared[i] = true;
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 1; i < appeared.length; i++) {
            if(!appeared[i]) result.add(i);
        }

        return result;
    }
}
