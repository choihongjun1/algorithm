package leetcode.medium.no451;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.get(c) == null) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : list) {
            for(int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }

        return sb.reverse().toString();
    }
}
