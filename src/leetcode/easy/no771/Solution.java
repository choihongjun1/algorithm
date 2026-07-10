package leetcode.easy.no771;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Boolean> map = new HashMap<>();
        for(char c : jewels.toCharArray()) {
            map.put(c, true);
        }

        int count = 0;
        for(char c : stones.toCharArray()) {
            if(map.get(c) != null) count++;
        }
        return count;
    }
}
