package leetcode.easy.no884;

import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] word1 = s1.split(" ");
        String[] word2 = s2.split(" ");

        for(String s : word1) {
            if(map.get(s) == null) map.put(s, 1);
            else map.put(s, map.get(s) + 1);
        }

        for(String s : word2) {
            if(map.get(s) == null) map.put(s, 1);
            else map.put(s, map.get(s) + 1);
        }

        List<String> uncommon = new ArrayList<>();
        for(String s : map.keySet()) {
            if(map.get(s) == 1) uncommon.add(s);
        }

        return uncommon.toArray(new String[uncommon.size()]);
    }
}
