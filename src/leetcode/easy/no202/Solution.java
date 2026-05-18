package leetcode.easy.no202;

import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<Integer, Integer> map = new HashMap();
    int count = 0;

    public boolean isHappy(int n) {
        if(n == 1) return true;
        if(map.get(n) != null && map.get(n) != count) return false;

        int sum = 0;
        String s = String.valueOf(n);
        for(int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            sum += digit * digit;
        }
        System.out.println("sum = " + sum);

        if(map.get(sum) == null) map.put(sum, ++count);

        return isHappy(sum);
    }
}
