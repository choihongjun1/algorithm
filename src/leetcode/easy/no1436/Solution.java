package leetcode.easy.no1436;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> s = new ArrayList<>();
        List<String> d = new ArrayList<>();
        for(List<String> path : paths) {
            s.add(path.get(0));
            d.add(path.get(1));
        }
        d.removeAll(s);
        return d.get(0);
    }
}
